package org.jf.dexlib2.analysis;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import lc.c;
import lc.g;
import lc.p;
import lc.q;
import lc.r;
import nc.k0;
import org.jf.dexlib2.DexFileFactory;
import org.jf.dexlib2.analysis.PathEntryLoader;
import org.jf.dexlib2.dexbacked.DexBackedOdexFile;
import org.jf.dexlib2.dexbacked.OatFile;
import org.jf.dexlib2.iface.DexFile;
import org.jf.dexlib2.iface.MultiDexContainer;

/* loaded from: classes3.dex */
public class ClassPathResolver {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Iterable<String> classPathDirs;
    private final PathEntryLoader pathEntryLoader;

    public static class NotFoundException extends Exception {
        public NotFoundException(String str, Object... objArr) {
            super(String.format(str, objArr));
        }
    }

    public static class ResolveException extends RuntimeException {
        public ResolveException(String str, Object... objArr) {
            super(String.format(str, objArr));
        }

        public ResolveException(Throwable th2) {
            super(th2);
        }

        public ResolveException(Throwable th2, String str, Object... objArr) {
            super(String.format(str, objArr), th2);
        }
    }

    public ClassPathResolver(List<String> list, List<String> list2, List<String> list3, MultiDexContainer.DexEntry<?> dexEntry) throws IOException {
        DexFile dexFile = dexEntry.getDexFile();
        this.classPathDirs = list;
        this.pathEntryLoader = new PathEntryLoader(dexEntry.getDexFile().getOpcodes());
        for (String str : list2 == null ? getDefaultBootClassPath(dexEntry, dexFile.getOpcodes().api) : list2) {
            try {
                loadLocalOrDeviceBootClassPathEntry(str);
            } catch (NotFoundException e10) {
                if (!str.endsWith(".odex")) {
                    throw new ResolveException(e10);
                }
                String str2 = str.substring(0, str.length() - 5) + ".jar";
                try {
                    loadLocalOrDeviceBootClassPathEntry(str2);
                } catch (NotFoundException unused) {
                    throw new ResolveException(e10);
                } catch (PathEntryLoader.NoDexException unused2) {
                    throw new ResolveException("Neither %s nor %s contain a dex file", str, str2);
                }
            } catch (PathEntryLoader.NoDexException e11) {
                if (!str.endsWith(".jar")) {
                    throw new ResolveException(e11);
                }
                String str3 = str.substring(0, str.length() - 4) + ".odex";
                try {
                    loadLocalOrDeviceBootClassPathEntry(str3);
                } catch (NotFoundException unused3) {
                    throw new ResolveException(e11);
                } catch (PathEntryLoader.NoDexException unused4) {
                    throw new ResolveException("Neither %s nor %s contain a dex file", str, str3);
                }
            }
        }
        Iterator<String> it = list3.iterator();
        while (it.hasNext()) {
            try {
                loadLocalClassPathEntry(it.next());
            } catch (PathEntryLoader.NoDexException e12) {
                throw new ResolveException(e12);
            }
        }
        MultiDexContainer<? extends T> container = dexEntry.getContainer();
        Iterator<String> it2 = container.getDexEntryNames().iterator();
        while (it2.hasNext()) {
            this.pathEntryLoader.getClassProviders().add(new DexClassProvider(container.getEntry(it2.next()).getDexFile()));
        }
    }

    private static List<String> bootClassPathForOat(OatFile oatFile) {
        List<String> bootClassPath = oatFile.getBootClassPath();
        return bootClassPath.isEmpty() ? k0.b("boot.oat") : replaceElementsSuffix(bootClassPath, ".art", ".oat");
    }

    private static List<String> getDefaultBootClassPath(MultiDexContainer.DexEntry<?> dexEntry, int i10) {
        Object container = dexEntry.getContainer();
        if (container instanceof OatFile) {
            return bootClassPathForOat((OatFile) container);
        }
        DexFile dexFile = dexEntry.getDexFile();
        return dexFile instanceof DexBackedOdexFile ? ((DexBackedOdexFile) dexFile).getDependencies() : i10 <= 8 ? k0.b("/system/framework/core.jar", "/system/framework/ext.jar", "/system/framework/framework.jar", "/system/framework/android.policy.jar", "/system/framework/services.jar") : i10 <= 11 ? k0.b("/system/framework/core.jar", "/system/framework/bouncycastle.jar", "/system/framework/ext.jar", "/system/framework/framework.jar", "/system/framework/android.policy.jar", "/system/framework/services.jar", "/system/framework/core-junit.jar") : i10 <= 13 ? k0.b("/system/framework/core.jar", "/system/framework/apache-xml.jar", "/system/framework/bouncycastle.jar", "/system/framework/ext.jar", "/system/framework/framework.jar", "/system/framework/android.policy.jar", "/system/framework/services.jar", "/system/framework/core-junit.jar") : i10 <= 15 ? k0.b("/system/framework/core.jar", "/system/framework/core-junit.jar", "/system/framework/bouncycastle.jar", "/system/framework/ext.jar", "/system/framework/framework.jar", "/system/framework/android.policy.jar", "/system/framework/services.jar", "/system/framework/apache-xml.jar", "/system/framework/filterfw.jar") : i10 <= 17 ? k0.b("/system/framework/core.jar", "/system/framework/core-junit.jar", "/system/framework/bouncycastle.jar", "/system/framework/ext.jar", "/system/framework/framework.jar", "/system/framework/telephony-common.jar", "/system/framework/mms-common.jar", "/system/framework/android.policy.jar", "/system/framework/services.jar", "/system/framework/apache-xml.jar") : i10 <= 18 ? k0.b("/system/framework/core.jar", "/system/framework/core-junit.jar", "/system/framework/bouncycastle.jar", "/system/framework/ext.jar", "/system/framework/framework.jar", "/system/framework/telephony-common.jar", "/system/framework/voip-common.jar", "/system/framework/mms-common.jar", "/system/framework/android.policy.jar", "/system/framework/services.jar", "/system/framework/apache-xml.jar") : i10 <= 19 ? k0.b("/system/framework/core.jar", "/system/framework/conscrypt.jar", "/system/framework/core-junit.jar", "/system/framework/bouncycastle.jar", "/system/framework/ext.jar", "/system/framework/framework.jar", "/system/framework/framework2.jar", "/system/framework/telephony-common.jar", "/system/framework/voip-common.jar", "/system/framework/mms-common.jar", "/system/framework/android.policy.jar", "/system/framework/services.jar", "/system/framework/apache-xml.jar", "/system/framework/webviewchromium.jar") : i10 <= 22 ? k0.b("/system/framework/core-libart.jar", "/system/framework/conscrypt.jar", "/system/framework/okhttp.jar", "/system/framework/core-junit.jar", "/system/framework/bouncycastle.jar", "/system/framework/ext.jar", "/system/framework/framework.jar", "/system/framework/telephony-common.jar", "/system/framework/voip-common.jar", "/system/framework/ims-common.jar", "/system/framework/mms-common.jar", "/system/framework/android.policy.jar", "/system/framework/apache-xml.jar") : i10 <= 23 ? k0.b("/system/framework/core-libart.jar", "/system/framework/conscrypt.jar", "/system/framework/okhttp.jar", "/system/framework/core-junit.jar", "/system/framework/bouncycastle.jar", "/system/framework/ext.jar", "/system/framework/framework.jar", "/system/framework/telephony-common.jar", "/system/framework/voip-common.jar", "/system/framework/ims-common.jar", "/system/framework/apache-xml.jar", "/system/framework/org.apache.http.legacy.boot.jar") : k0.b("/system/framework/core-oj.jar", "/system/framework/core-libart.jar", "/system/framework/conscrypt.jar", "/system/framework/okhttp.jar", "/system/framework/core-junit.jar", "/system/framework/bouncycastle.jar", "/system/framework/ext.jar", "/system/framework/framework.jar", "/system/framework/telephony-common.jar", "/system/framework/voip-common.jar", "/system/framework/ims-common.jar", "/system/framework/apache-xml.jar", "/system/framework/org.apache.http.legacy.boot.jar");
    }

    private boolean loadLocalClassPathEntry(String str) throws IOException, PathEntryLoader.NoDexException {
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            return false;
        }
        try {
            this.pathEntryLoader.loadEntry(file, true);
            return true;
        } catch (DexFileFactory.UnsupportedFileTypeException e10) {
            throw new ResolveException(e10, "Couldn't load classpath entry %s", str);
        }
    }

    private void loadLocalOrDeviceBootClassPathEntry(String str) throws NotFoundException, IOException, PathEntryLoader.NoDexException {
        if (loadLocalClassPathEntry(str)) {
            return;
        }
        List<String> listSplitDevicePath = splitDevicePath(str);
        g gVar = new g(String.valueOf(File.separatorChar));
        Iterator<String> it = this.classPathDirs.iterator();
        while (it.hasNext()) {
            File file = new File(it.next());
            if (file.exists()) {
                for (int i10 = 0; i10 < listSplitDevicePath.size(); i10++) {
                    File file2 = new File(file, gVar.b(listSplitDevicePath.subList(i10, listSplitDevicePath.size())));
                    if (file2.exists() && file2.isFile()) {
                        this.pathEntryLoader.loadEntry(file2, true);
                        return;
                    }
                }
            }
        }
        throw new NotFoundException("Could not find classpath entry %s", str);
    }

    private static List<String> replaceElementsSuffix(List<String> list, String str, String str2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str3 = list.get(i10);
            if (str3.endsWith(str)) {
                list.set(i10, str3.substring(0, str3.length() - str.length()) + str2);
            }
        }
        return list;
    }

    private static List<String> splitDevicePath(String str) {
        r rVar = new r(new p(new c.b()));
        str.getClass();
        return k0.a(new q(rVar, str));
    }

    public List<ClassProvider> getResolvedClassProviders() {
        return this.pathEntryLoader.getResolvedClassProviders();
    }

    public ClassPathResolver(List<String> list, List<String> list2, MultiDexContainer.DexEntry<?> dexEntry) throws IOException {
        this(list, null, list2, dexEntry);
    }
}
