package org.jf.dexlib2;

import androidx.room.y0;
import h1.m;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import k3.a;
import lc.g;
import nc.r;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.DexBackedOdexFile;
import org.jf.dexlib2.dexbacked.OatFile;
import org.jf.dexlib2.dexbacked.ZipDexContainer;
import org.jf.dexlib2.iface.DexFile;
import org.jf.dexlib2.iface.MultiDexContainer;
import org.jf.dexlib2.writer.pool.DexPool;
import org.jf.util.ExceptionWithContext;

/* loaded from: classes3.dex */
public final class DexFileFactory {

    public static class DexEntryFinder {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final MultiDexContainer<? extends DexBackedDexFile> dexContainer;
        private final String filename;

        public DexEntryFinder(String str, MultiDexContainer<? extends DexBackedDexFile> multiDexContainer) {
            this.filename = str;
            this.dexContainer = multiDexContainer;
        }

        public MultiDexContainer.DexEntry<? extends DexBackedDexFile> findEntry(String str, boolean z10) throws IOException {
            if (z10) {
                try {
                    MultiDexContainer.DexEntry entry = this.dexContainer.getEntry(str);
                    if (entry != null) {
                        return entry;
                    }
                    throw new DexFileNotFoundException("Could not find entry %s in %s.", str, this.filename);
                } catch (DexBackedDexFile.NotADexFile unused) {
                    throw new UnsupportedFileTypeException("Entry %s in %s is not a dex file", str, this.filename);
                }
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (String str2 : this.dexContainer.getDexEntryNames()) {
                if (DexFileFactory.fullEntryMatch(str2, str)) {
                    arrayList.add(str2);
                    arrayList2.add(this.dexContainer.getEntry(str2));
                } else if (DexFileFactory.partialEntryMatch(str2, str)) {
                    arrayList3.add(str2);
                    arrayList4.add(this.dexContainer.getEntry(str2));
                }
            }
            if (arrayList2.size() == 1) {
                try {
                    return (MultiDexContainer.DexEntry) arrayList2.get(0);
                } catch (DexBackedDexFile.NotADexFile unused2) {
                    throw new UnsupportedFileTypeException("Entry %s in %s is not a dex file", arrayList.get(0), this.filename);
                }
            }
            if (arrayList2.size() > 1) {
                String str3 = this.filename;
                String strB = new g(", ").b(arrayList);
                StringBuilder sbA = y0.a("Multiple entries in ", str3, " match ", str, ": ");
                sbA.append(strB);
                throw new MultipleMatchingDexEntriesException(sbA.toString(), new Object[0]);
            }
            if (arrayList4.size() == 0) {
                throw new DexFileNotFoundException("Could not find a dex entry in %s matching %s", this.filename, str);
            }
            if (arrayList4.size() <= 1) {
                return (MultiDexContainer.DexEntry) arrayList4.get(0);
            }
            String str4 = this.filename;
            String strB2 = new g(", ").b(arrayList3);
            StringBuilder sbA2 = y0.a("Multiple dex entries in ", str4, " match ", str, ": ");
            sbA2.append(strB2);
            throw new MultipleMatchingDexEntriesException(sbA2.toString(), new Object[0]);
        }
    }

    public static class DexFileNotFoundException extends ExceptionWithContext {
        public DexFileNotFoundException(String str, Object... objArr) {
            super(str, objArr);
        }

        public DexFileNotFoundException(Throwable th2, String str, Object... objArr) {
            super(th2, str, objArr);
        }
    }

    public static class FilenameVdexProvider implements OatFile.VdexProvider {
        private byte[] buf = null;
        private boolean loadedVdex = false;
        private final File vdexFile;

        public FilenameVdexProvider(File file) {
            File parentFile = file.getAbsoluteFile().getParentFile();
            String absolutePath = file.getAbsolutePath();
            absolutePath.getClass();
            String name = new File(absolutePath).getName();
            int iLastIndexOf = name.lastIndexOf(46);
            this.vdexFile = new File(parentFile, a.a(iLastIndexOf != -1 ? name.substring(0, iLastIndexOf) : name, ".vdex"));
        }

        @Override // org.jf.dexlib2.dexbacked.OatFile.VdexProvider
        public byte[] getVdex() {
            File parentFile;
            if (!this.loadedVdex) {
                File file = this.vdexFile;
                if (!file.exists() && (parentFile = file.getParentFile().getParentFile()) != null) {
                    file = new File(parentFile, this.vdexFile.getName());
                }
                if (file.exists()) {
                    try {
                        this.buf = oc.a.c(new FileInputStream(file));
                    } catch (FileNotFoundException unused) {
                        this.buf = null;
                    } catch (IOException e10) {
                        throw new RuntimeException(e10);
                    }
                }
                this.loadedVdex = true;
            }
            return this.buf;
        }
    }

    public static class MultipleMatchingDexEntriesException extends ExceptionWithContext {
        public MultipleMatchingDexEntriesException(String str, Object... objArr) {
            super(String.format(str, objArr), new Object[0]);
        }
    }

    public static class SingletonMultiDexContainer implements MultiDexContainer<DexBackedDexFile> {
        private final DexBackedDexFile dexFile;
        private final String entryName;

        public SingletonMultiDexContainer(String str, DexBackedDexFile dexBackedDexFile) {
            this.entryName = str;
            this.dexFile = dexBackedDexFile;
        }

        @Override // org.jf.dexlib2.iface.MultiDexContainer
        public List<String> getDexEntryNames() {
            String str = this.entryName;
            r.a aVar = r.f18735b;
            Object[] objArr = {str};
            m.c(1, objArr);
            return r.i(1, objArr);
        }

        @Override // org.jf.dexlib2.iface.MultiDexContainer
        public MultiDexContainer.DexEntry<DexBackedDexFile> getEntry(final String str) {
            if (str.equals(this.entryName)) {
                return new MultiDexContainer.DexEntry<DexBackedDexFile>() { // from class: org.jf.dexlib2.DexFileFactory.SingletonMultiDexContainer.1
                    @Override // org.jf.dexlib2.iface.MultiDexContainer.DexEntry
                    public MultiDexContainer<? extends DexBackedDexFile> getContainer() {
                        return SingletonMultiDexContainer.this;
                    }

                    @Override // org.jf.dexlib2.iface.MultiDexContainer.DexEntry
                    public String getEntryName() {
                        return str;
                    }

                    @Override // org.jf.dexlib2.iface.MultiDexContainer.DexEntry
                    public DexBackedDexFile getDexFile() {
                        return SingletonMultiDexContainer.this.dexFile;
                    }
                };
            }
            return null;
        }
    }

    public static class UnsupportedFileTypeException extends ExceptionWithContext {
        public UnsupportedFileTypeException(String str, Object... objArr) {
            super(String.format(str, objArr), new Object[0]);
        }
    }

    public static class UnsupportedOatVersionException extends ExceptionWithContext {
        public final OatFile oatFile;

        public UnsupportedOatVersionException(OatFile oatFile) {
            super("Unsupported oat version: %d", Integer.valueOf(oatFile.getOatVersion()));
            this.oatFile = oatFile;
        }
    }

    private DexFileFactory() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean fullEntryMatch(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (str.charAt(0) == '/') {
            str = str.substring(1);
        }
        if (str2.charAt(0) == '/') {
            str2 = str2.substring(1);
        }
        return str.equals(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d A[Catch: all -> 0x002d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x002d, blocks: (B:8:0x001c, B:13:0x002f, B:16:0x0040, B:20:0x004d, B:24:0x0057, B:25:0x005c), top: B:34:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MultiDexContainer<? extends DexBackedDexFile> loadDexContainer(File file, Opcodes opcodes) throws IOException {
        OatFile oatFileFromInputStream;
        if (!file.exists()) {
            throw new DexFileNotFoundException("%s does not exist", file.getName());
        }
        ZipDexContainer zipDexContainer = new ZipDexContainer(file, opcodes);
        if (zipDexContainer.isZipFile()) {
            return zipDexContainer;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            try {
                try {
                    try {
                        return new SingletonMultiDexContainer(file.getPath(), DexBackedDexFile.fromInputStream(opcodes, bufferedInputStream));
                    } catch (DexBackedDexFile.NotADexFile unused) {
                        return new SingletonMultiDexContainer(file.getPath(), DexBackedOdexFile.fromInputStream(opcodes, (InputStream) bufferedInputStream));
                    }
                } catch (OatFile.NotAnOatFileException unused2) {
                    oatFileFromInputStream = null;
                    if (oatFileFromInputStream != null) {
                        bufferedInputStream.close();
                        throw new UnsupportedFileTypeException("%s is not an apk, dex, odex or oat file.", file.getPath());
                    }
                    if (oatFileFromInputStream.isSupportedVersion() != 0) {
                        return oatFileFromInputStream;
                    }
                    throw new UnsupportedOatVersionException(oatFileFromInputStream);
                }
            } catch (DexBackedOdexFile.NotAnOdexFile unused3) {
                oatFileFromInputStream = OatFile.fromInputStream(bufferedInputStream, new FilenameVdexProvider(file));
                if (oatFileFromInputStream != null) {
                }
            }
        } finally {
            bufferedInputStream.close();
        }
    }

    public static MultiDexContainer.DexEntry<? extends DexBackedDexFile> loadDexEntry(File file, String str, boolean z10, Opcodes opcodes) throws IOException {
        OatFile oatFileFromInputStream;
        if (!file.exists()) {
            throw new DexFileNotFoundException("Container file %s does not exist", file.getName());
        }
        try {
            return new DexEntryFinder(file.getPath(), new ZipDexContainer(file, opcodes)).findEntry(str, z10);
        } catch (ZipDexContainer.NotAZipFileException unused) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                try {
                    oatFileFromInputStream = OatFile.fromInputStream(bufferedInputStream, new FilenameVdexProvider(file));
                } catch (OatFile.NotAnOatFileException unused2) {
                    oatFileFromInputStream = null;
                }
                if (oatFileFromInputStream == null) {
                    bufferedInputStream.close();
                    throw new UnsupportedFileTypeException("%s is not an apk or oat file.", file.getPath());
                }
                if (oatFileFromInputStream.isSupportedVersion() == 0) {
                    throw new UnsupportedOatVersionException(oatFileFromInputStream);
                }
                if (oatFileFromInputStream.getDexFiles().size() != 0) {
                    return new DexEntryFinder(file.getPath(), oatFileFromInputStream).findEntry(str, z10);
                }
                throw new DexFileNotFoundException("Oat file %s contains no dex files", file.getName());
            } finally {
                bufferedInputStream.close();
            }
        }
    }

    public static DexBackedDexFile loadDexFile(String str, Opcodes opcodes) throws IOException {
        return loadDexFile(new File(str), opcodes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean partialEntryMatch(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (!str.endsWith(str2)) {
            return false;
        }
        char cCharAt = str.charAt((str.length() - str2.length()) - 1);
        char cCharAt2 = str2.charAt(0);
        return cCharAt2 == ':' || cCharAt2 == '/' || cCharAt2 == '!' || cCharAt == ':' || cCharAt == '/' || cCharAt == '!';
    }

    public static void writeDexFile(String str, DexFile dexFile) throws IOException {
        DexPool.writeTo(str, dexFile);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b A[Catch: all -> 0x0034, TRY_ENTER, TryCatch #1 {all -> 0x0034, blocks: (B:7:0x002c, B:12:0x0036, B:15:0x003e, B:19:0x004b, B:21:0x0051, B:23:0x005b, B:26:0x0066, B:27:0x0075, B:28:0x0076, B:29:0x007b), top: B:38:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static DexBackedDexFile loadDexFile(File file, Opcodes opcodes) throws IOException {
        OatFile oatFileFromInputStream;
        if (!file.exists()) {
            throw new DexFileNotFoundException("%s does not exist", file.getName());
        }
        try {
            return (DexBackedDexFile) new DexEntryFinder(file.getPath(), new ZipDexContainer(file, opcodes)).findEntry("classes.dex", true).getDexFile();
        } catch (ZipDexContainer.NotAZipFileException unused) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                try {
                    try {
                        try {
                            return DexBackedDexFile.fromInputStream(opcodes, bufferedInputStream);
                        } finally {
                            bufferedInputStream.close();
                        }
                    } catch (DexBackedOdexFile.NotAnOdexFile unused2) {
                        oatFileFromInputStream = OatFile.fromInputStream(bufferedInputStream, new FilenameVdexProvider(file));
                        if (oatFileFromInputStream != null) {
                            bufferedInputStream.close();
                            throw new UnsupportedFileTypeException("%s is not an apk, dex, odex or oat file.", file.getPath());
                        }
                        if (oatFileFromInputStream.isSupportedVersion() == 0) {
                            throw new UnsupportedOatVersionException(oatFileFromInputStream);
                        }
                        List<DexBackedDexFile> dexFiles = oatFileFromInputStream.getDexFiles();
                        if (dexFiles.size() != 0) {
                            return dexFiles.get(0);
                        }
                        throw new DexFileNotFoundException("Oat file %s contains no dex files", file.getName());
                    }
                } catch (OatFile.NotAnOatFileException unused3) {
                    oatFileFromInputStream = null;
                    if (oatFileFromInputStream != null) {
                    }
                }
            } catch (DexBackedDexFile.NotADexFile unused4) {
                return DexBackedOdexFile.fromInputStream(opcodes, (InputStream) bufferedInputStream);
            }
        }
    }
}
