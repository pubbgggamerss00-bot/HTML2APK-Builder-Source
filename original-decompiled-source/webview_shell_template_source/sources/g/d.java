package g;

import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d implements c.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f13077a;

    public d(AppCompatActivity appCompatActivity) {
        this.f13077a = appCompatActivity;
    }

    @Override // c.b
    public final void a(ComponentActivity componentActivity) {
        AppCompatActivity appCompatActivity = this.f13077a;
        f fVarH = appCompatActivity.h();
        fVarH.g();
        appCompatActivity.getSavedStateRegistry().a("androidx:appcompat");
        fVarH.j();
    }
}
