package f3;

import android.content.Context;
import android.content.res.Resources;
import android.view.DragEvent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class o {
    public static final n a(long j10, long j11) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & BodyPartID.bodyIdMax);
        return new n(i10, i11, ((int) (j11 >> 32)) + i10, ((int) (j11 & BodyPartID.bodyIdMax)) + i11);
    }

    public static final long b(m1.c cVar) {
        DragEvent dragEvent = cVar.f17619a;
        float x10 = dragEvent.getX();
        float y10 = dragEvent.getY();
        return (Float.floatToRawIntBits(x10) << 32) | (Float.floatToRawIntBits(y10) & BodyPartID.bodyIdMax);
    }

    public static final Resources c(x0.j jVar) {
        jVar.f(AndroidCompositionLocals_androidKt.f1280a);
        return ((Context) jVar.f(AndroidCompositionLocals_androidKt.f1281b)).getResources();
    }

    public static final n d(p1.e eVar) {
        return new n(Math.round(eVar.f21131a), Math.round(eVar.f21132b), Math.round(eVar.f21133c), Math.round(eVar.f21134d));
    }
}
