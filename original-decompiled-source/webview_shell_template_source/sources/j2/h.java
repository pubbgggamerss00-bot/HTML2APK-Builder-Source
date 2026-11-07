package j2;

import android.content.Context;
import android.text.TextUtils;
import z1.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h implements b.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f13468a;

    public h(Context context) {
        this.f13468a = context;
    }

    @Override // z1.b.c
    public final z1.b a(b.C0109b c0109b) {
        String str = c0109b.f15425b;
        b.a aVar = c0109b.f15426c;
        if (aVar == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        Context context = this.f13468a;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        b.C0109b c0109b2 = new b.C0109b(context, str, aVar, true);
        return new a2.b(c0109b2.f15424a, c0109b2.f15425b, c0109b2.f15426c, c0109b2.f15427d);
    }
}
