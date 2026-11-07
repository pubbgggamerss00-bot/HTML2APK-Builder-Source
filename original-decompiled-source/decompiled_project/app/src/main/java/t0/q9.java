package t0;

import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.x509.DisplayText;

/* loaded from: classes.dex */
public final class q9 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f26800a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26801b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x.m f26802c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df f26803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q1.f2 f26804e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(boolean z10, boolean z11, x.m mVar, df dfVar, q1.f2 f2Var) {
        super(2);
        this.f26800a = z10;
        this.f26801b = z11;
        this.f26802c = mVar;
        this.f26803d = dfVar;
        this.f26804e = f2Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            k9.f26240a.a(this.f26800a, this.f26801b, this.f26802c, null, this.f26803d, this.f26804e, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, jVar2, 100663296, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
        }
        return pg.f0.f21461a;
    }
}
