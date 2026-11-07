package h7;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.apksig.internal.apk.v4.V4Signature;
import g7.e0;

/* loaded from: classes.dex */
public final class r {
    public static final void a(Object obj, String str, androidx.compose.ui.d dVar, g2.j jVar, x0.j jVar2, int i10) {
        b.b(obj, str, e0.a((Context) jVar2.f(AndroidCompositionLocals_androidKt.f1281b)), dVar, jVar, jVar2, ((i10 << 3) & V4Signature.MAX_SIGNING_INFOS_SIZE) | (i10 & 126) | 12582912, 0, 0);
    }
}
