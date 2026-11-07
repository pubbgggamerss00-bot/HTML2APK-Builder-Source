package com.basitce.htmltoapk.data.apkgenerator;

import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.BuildLogger;
import i0.x1;
import i8.n;
import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import kotlin.jvm.internal.r;
import mh.t;
import mh.x;
import org.jf.dexlib2.DexFileFactory;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.iface.DexFile;
import org.jf.dexlib2.rewriter.DexFileRewriter;
import org.jf.dexlib2.rewriter.DexRewriter;
import qg.o;

/* loaded from: classes.dex */
public final class DexRepackager {
    public static final int $stable = 0;
    public static final DexRepackager INSTANCE = new DexRepackager();
    private static final String LOG_TAG = "DexRepackager";

    private DexRepackager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rewriteDexDirectory$lambda$0(File file, String str) {
        r.b(str);
        return t.p(str, "classes", false) && t.i(str, ".dex", false);
    }

    public final void rewriteDexDirectory(File dexDir, String oldPackage, String newPackage) throws IOException {
        r.e(dexDir, "dexDir");
        r.e(oldPackage, "oldPackage");
        r.e(newPackage, "newPackage");
        if (oldPackage.equals(newPackage) || x.A(newPackage)) {
            BuildLogger.INSTANCE.detail(R.string.build_log_dex_skip_rewrite, oldPackage, newPackage);
            return;
        }
        String strD = n.d(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f7029u, t.m(oldPackage, '.', '/'), "/");
        String strD2 = n.d(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f7029u, t.m(newPackage, '.', '/'), "/");
        File[] fileArrListFiles = dexDir.listFiles(new e());
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        if (fileArrListFiles.length == 0) {
            BuildLogger.INSTANCE.detail(R.string.build_log_dex_none, new Object[0]);
            return;
        }
        DexFileRewriter dexFileRewriter = new DexFileRewriter(new DexRewriter(new DexRepackager$rewriteDexDirectory$rewriter$1(strD, strD2)));
        for (File file : o.z(new Comparator() { // from class: com.basitce.htmltoapk.data.apkgenerator.DexRepackager$rewriteDexDirectory$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t3, T t10) {
                return x1.b(((File) t3).getName(), ((File) t10).getName());
            }
        }, fileArrListFiles)) {
            BuildLogger buildLogger = BuildLogger.INSTANCE;
            buildLogger.tick(BuildLogger.BuildTick.DEX_FILE);
            buildLogger.detail(R.string.build_log_dex_rewriting, file.getName());
            DexBackedDexFile dexBackedDexFileLoadDexFile = DexFileFactory.loadDexFile(file, Opcodes.getDefault());
            r.c(dexBackedDexFileLoadDexFile, "null cannot be cast to non-null type org.jf.dexlib2.dexbacked.DexBackedDexFile");
            DexFile dexFileRewrite = dexFileRewriter.rewrite((DexFile) dexBackedDexFileLoadDexFile);
            r.d(dexFileRewrite, "rewrite(...)");
            File file2 = new File(file.getParentFile(), k3.a.a(file.getName(), ".tmp"));
            DexFileFactory.writeDexFile(file2.getAbsolutePath(), dexFileRewrite);
            if (!file2.exists() || file2.length() <= 0) {
                file2.delete();
                throw new IOException(n.d("DEX rewrite failed for ", file.getName(), ": output file is empty or missing"));
            }
            file.delete();
            file2.renameTo(file);
            buildLogger.tick(BuildLogger.BuildTick.DEX_WRITTEN);
            buildLogger.detail(R.string.build_log_dex_rewritten, file.getName(), Long.valueOf(file.length()));
            System.gc();
        }
    }
}
