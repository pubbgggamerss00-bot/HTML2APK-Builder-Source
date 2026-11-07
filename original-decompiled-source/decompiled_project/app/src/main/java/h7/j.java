package h7;

import com.yalantis.ucrop.view.CropImageView;
import g2.g1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import pg.f0;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12319a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12320b;

    public /* synthetic */ j(Object obj, int i10) {
        this.f12319a = i10;
        this.f12320b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f12319a) {
            case 0:
                ((g1.a) obj).d((g1) this.f12320b, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
                return f0.f21461a;
            default:
                s.b bVar = (s.b) this.f12320b;
                f3.d offset = (f3.d) obj;
                kotlin.jvm.internal.r.e(offset, "$this$offset");
                return new f3.m((0 << 32) | (gh.a.b(((Number) bVar.d()).floatValue()) & BodyPartID.bodyIdMax));
        }
    }
}
