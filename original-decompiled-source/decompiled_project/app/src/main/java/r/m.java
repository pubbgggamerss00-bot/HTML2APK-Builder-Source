package r;

import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.s implements eh.p<f3.p, f3.p, s.l1<f3.p>> {

    /* renamed from: a, reason: collision with root package name */
    public static final m f22883a = new m(2);

    @Override // eh.p
    public final s.l1<f3.p> invoke(f3.p pVar, f3.p pVar2) {
        long j10 = pVar.f8826a;
        long j11 = pVar2.f8826a;
        long j12 = 1;
        return s.m.c(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new f3.p((j12 & BodyPartID.bodyIdMax) | (j12 << 32)), 1);
    }
}
