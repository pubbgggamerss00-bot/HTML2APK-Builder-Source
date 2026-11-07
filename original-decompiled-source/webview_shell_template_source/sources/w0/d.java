package w0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.camera.camera2.interop.g;
import w0.f;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f14855a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InputConnection inputConnection, g gVar) {
        super(inputConnection, false);
        this.f14855a = gVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i6, Bundle bundle) {
        f fVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            fVar = new f(new f.a(inputContentInfo));
        }
        if (this.f14855a.a(fVar, i6, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i6, bundle);
    }
}
