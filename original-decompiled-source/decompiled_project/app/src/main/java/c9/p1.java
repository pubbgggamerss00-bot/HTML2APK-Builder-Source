package c9;

import b9.a3;
import java.io.File;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.edit.PdfEditorViewModel", f = "PdfEditorViewModel.kt", l = {102}, m = "addSource")
/* loaded from: classes.dex */
public final class p1 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public s1 f5170a;

    /* renamed from: b, reason: collision with root package name */
    public File f5171b;

    /* renamed from: c, reason: collision with root package name */
    public a3 f5172c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f5173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1 f5174e;

    /* renamed from: f, reason: collision with root package name */
    public int f5175f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(s1 s1Var, vg.c cVar) {
        super(cVar);
        this.f5174e = s1Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f5173d = obj;
        this.f5175f |= PKIFailureInfo.systemUnavail;
        return s1.f(this.f5174e, null, this);
    }
}
