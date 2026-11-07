package q8;

import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.x509.DisplayText;
import x8.w2;

@vg.e(c = "com.basitce.htmltoapk.ui.components.ContainerTransitionState", f = "ContainerTransition.kt", l = {DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 204, 205, 207}, m = "open-sW7UJKQ")
/* loaded from: classes.dex */
public final class v0 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public w0 f22416a;

    /* renamed from: b, reason: collision with root package name */
    public w2.a f22417b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f22418c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0 f22419d;

    /* renamed from: e, reason: collision with root package name */
    public int f22420e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(w0 w0Var, vg.c cVar) {
        super(cVar);
        this.f22419d = w0Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f22418c = obj;
        this.f22420e |= PKIFailureInfo.systemUnavail;
        return this.f22419d.b(null, 0L, CropImageView.DEFAULT_ASPECT_RATIO, false, null, null, this);
    }
}
