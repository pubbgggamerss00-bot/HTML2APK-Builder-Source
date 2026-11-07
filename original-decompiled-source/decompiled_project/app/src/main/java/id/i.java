package id;

import android.content.Context;
import com.google.firebase.FirebaseCommonRegistrar;
import ne.g;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements g.a {
    public static void b(w1.e eVar, float f10, float f11, float f12, float f13) {
        eVar.g(f10, f11);
        eVar.f(f12, f13);
        eVar.a();
    }

    @Override // ne.g.a
    public String a(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
    }
}
