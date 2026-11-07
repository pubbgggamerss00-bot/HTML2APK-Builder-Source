package androidx.compose.animation;

import com.yalantis.ucrop.view.CropImageView;
import f3.p;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import s.m;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final long f769a;

    static {
        long j10 = PKIFailureInfo.systemUnavail;
        f769a = (j10 & BodyPartID.bodyIdMax) | (j10 << 32);
    }

    public static androidx.compose.ui.d a(androidx.compose.ui.d dVar) {
        long j10 = 1;
        return e1.d.e(dVar).h(new SizeAnimationModifierElement(m.c(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new p((j10 & BodyPartID.bodyIdMax) | (j10 << 32)), 1)));
    }
}
