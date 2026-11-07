package com.basitce.htmltoapk.data.apkgenerator;

import kotlin.jvm.internal.r;
import mh.t;
import mh.x;
import org.jf.dexlib2.rewriter.Rewriter;
import org.jf.dexlib2.rewriter.RewriterModule;
import org.jf.dexlib2.rewriter.Rewriters;

/* loaded from: classes.dex */
public final class DexRepackager$rewriteDexDirectory$rewriter$1 extends RewriterModule {
    final /* synthetic */ String $newTypePrefix;
    final /* synthetic */ String $oldTypePrefix;

    public DexRepackager$rewriteDexDirectory$rewriter$1(String str, String str2) {
        this.$oldTypePrefix = str;
        this.$newTypePrefix = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getTypeRewriter$lambda$0(String str, String str2, String type) {
        r.e(type, "type");
        return t.p(type, str, false) ? k3.a.a(str2, x.I(type, str)) : type;
    }

    @Override // org.jf.dexlib2.rewriter.RewriterModule
    public Rewriter<String> getTypeRewriter(Rewriters rewriters) {
        r.e(rewriters, "rewriters");
        final String str = this.$oldTypePrefix;
        final String str2 = this.$newTypePrefix;
        return new Rewriter() { // from class: com.basitce.htmltoapk.data.apkgenerator.f
            @Override // org.jf.dexlib2.rewriter.Rewriter
            public final Object rewrite(Object obj) {
                return DexRepackager$rewriteDexDirectory$rewriter$1.getTypeRewriter$lambda$0(str, str2, (String) obj);
            }
        };
    }
}
