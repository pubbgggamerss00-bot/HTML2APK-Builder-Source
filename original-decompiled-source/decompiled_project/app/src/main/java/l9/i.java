package l9;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import i2.g;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements OnFailureListener {
    public static void a(int i10, x0.j jVar, int i11, g.a.C0128a c0128a) {
        jVar.C(Integer.valueOf(i10));
        jVar.J(Integer.valueOf(i11), c0128a);
    }

    public static void b(w1.e eVar, float f10, float f11, float f12, float f13) {
        eVar.a();
        eVar.h(f10, f11);
        eVar.f(f12, f13);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.d("AppUpdateHelper", "In-app update check ignored or unavailable: " + exc.getMessage());
    }
}
