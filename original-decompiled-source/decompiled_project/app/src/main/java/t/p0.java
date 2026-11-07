package t;

import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.f2;
import q1.s1;

/* loaded from: classes.dex */
public final class p0 implements f2 {

    /* renamed from: a, reason: collision with root package name */
    public static final p0 f25313a = new p0();

    @Override // q1.f2
    public final q1.s1 a(long j10, f3.r rVar, f3.d dVar) {
        float fB1 = dVar.b1(d0.f25188a);
        return new s1.b(new p1.e(CropImageView.DEFAULT_ASPECT_RATIO, -fB1, Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)) + fB1));
    }
}
