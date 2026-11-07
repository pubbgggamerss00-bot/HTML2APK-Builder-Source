package id;

import android.content.Context;
import kotlin.jvm.internal.r;
import ne.g;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements g.a {
    public static String b(String str, String str2, Context context, int i10, String str3) {
        r.d(str, str2);
        String string = context.getString(i10);
        r.d(string, str3);
        return string;
    }

    public static void c(w1.e eVar, float f10, float f11, float f12, float f13) {
        eVar.f(f10, f11);
        eVar.l(f12);
        eVar.e(f13);
    }

    @Override // ne.g.a
    public String a(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.f6995l : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
    }
}
