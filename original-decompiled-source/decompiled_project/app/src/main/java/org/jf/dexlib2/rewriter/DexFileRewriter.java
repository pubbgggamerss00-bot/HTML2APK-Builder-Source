package org.jf.dexlib2.rewriter;

import java.util.Set;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.iface.DexFile;

/* loaded from: classes3.dex */
public class DexFileRewriter implements Rewriter<DexFile> {
    protected final Rewriters rewriters;

    public class RewrittenDexFile implements DexFile {
        protected final DexFile dexFile;

        public RewrittenDexFile(DexFile dexFile) {
            this.dexFile = dexFile;
        }

        @Override // org.jf.dexlib2.iface.DexFile
        public Set<? extends ClassDef> getClasses() {
            return RewriterUtils.rewriteSet(DexFileRewriter.this.rewriters.getClassDefRewriter(), this.dexFile.getClasses());
        }

        @Override // org.jf.dexlib2.iface.DexFile
        public Opcodes getOpcodes() {
            return this.dexFile.getOpcodes();
        }
    }

    public DexFileRewriter(Rewriters rewriters) {
        this.rewriters = rewriters;
    }

    @Override // org.jf.dexlib2.rewriter.Rewriter
    public DexFile rewrite(DexFile dexFile) {
        return new RewrittenDexFile(dexFile);
    }
}
