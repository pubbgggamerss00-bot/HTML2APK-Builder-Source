package s5;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p5.h0;
import p5.k0;
import pg.s;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f24508a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f24509b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f24510c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f24511d;

    /* renamed from: e, reason: collision with root package name */
    public String f24512e;

    /* renamed from: f, reason: collision with root package name */
    public s f24513f;

    public o(k0 k0Var) {
        this.f24508a = k0Var;
    }

    public final k0.b a(String route) {
        h0 h0Var;
        kotlin.jvm.internal.r.e(route, "route");
        s sVar = this.f24513f;
        if (sVar == null || (h0Var = (h0) sVar.getValue()) == null) {
            return null;
        }
        int i10 = k0.f21233e;
        String uriString = "android-app://androidx.navigation/".concat(route);
        kotlin.jvm.internal.r.e(uriString, "uriString");
        Uri uri = Uri.parse(uriString);
        kotlin.jvm.internal.r.d(uri, "parse(...)");
        Bundle bundleD = h0Var.d(uri, this.f24510c);
        if (bundleD == null) {
            return null;
        }
        return new k0.b(this.f24508a, bundleD, h0Var.f21227l, h0Var.b(uri), false, -1);
    }
}
