package g;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.savedstate.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c implements a.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f13076a;

    public c(AppCompatActivity appCompatActivity) {
        this.f13076a = appCompatActivity;
    }

    @Override // androidx.savedstate.a.b
    public final Bundle a() {
        Bundle bundle = new Bundle();
        this.f13076a.h().getClass();
        return bundle;
    }
}
