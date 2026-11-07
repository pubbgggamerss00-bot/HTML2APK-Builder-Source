package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class zj1 {
    public static final String h = new UUID(0, 0).toString();

    /* renamed from: a, reason: collision with root package name */
    public final String f11314a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11315b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11316c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11317d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11318e;

    /* renamed from: f, reason: collision with root package name */
    public final yj1 f11319f;

    /* renamed from: g, reason: collision with root package name */
    public final xj1 f11320g;

    public zj1(Context context, String str, String str2, String str3) {
        if (yj1.f11008c == null) {
            yj1.f11008c = new yj1(context);
        }
        this.f11319f = yj1.f11008c;
        this.f11320g = xj1.d(context);
        this.f11314a = str;
        this.f11315b = str.concat("_3p");
        this.f11316c = str2;
        this.f11317d = str2.concat("_3p");
        this.f11318e = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y2 a(String str, String str2, long j6, boolean z6) throws IOException {
        String str3 = this.f11315b;
        yj1 yj1Var = this.f11319f;
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(h)) {
                    String string = yj1Var.f11010b.getString(str3, null);
                    String string2 = yj1Var.f11010b.getString("paid_3p_hash_key", null);
                    if (string != null && string2 != null) {
                        if (!string.equals(e(str, str2, string2))) {
                            return b(str, str2);
                        }
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new y2();
        }
        boolean z7 = str != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.f11318e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        String str4 = this.f11316c;
        String str5 = this.f11317d;
        long j7 = yj1Var.f11010b.getLong(z7 ? str5 : str4, -1L);
        if (j7 != -1) {
            if (jCurrentTimeMillis < j7) {
                yj1Var.a(z7 ? str5 : str4, Long.valueOf(jCurrentTimeMillis));
            } else if (jCurrentTimeMillis >= j7 + j6) {
                return b(str, str2);
            }
        }
        if (!z7) {
            str3 = this.f11314a;
        }
        String string3 = yj1Var.f11010b.getString(str3, null);
        if (string3 == null && !z6) {
            return b(str, str2);
        }
        if (z7) {
            str4 = str5;
        }
        return new y2(string3, yj1Var.f11010b.getLong(str4, -1L));
    }

    public final y2 b(String str, String str2) throws IOException {
        if (str == null) {
            return c(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.f11319f.a("paid_3p_hash_key", string);
        return c(e(str, str2, string), true);
    }

    public final y2 c(String str, boolean z6) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.f11318e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        String str2 = z6 ? this.f11317d : this.f11316c;
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        yj1 yj1Var = this.f11319f;
        yj1Var.a(str2, lValueOf);
        yj1Var.a(z6 ? this.f11315b : this.f11314a, str);
        return new y2(str, jCurrentTimeMillis);
    }

    public final void d(boolean z6) throws IOException {
        String str = z6 ? this.f11317d : this.f11316c;
        yj1 yj1Var = this.f11319f;
        yj1Var.b(str);
        yj1Var.b(z6 ? this.f11315b : this.f11314a);
    }

    public final String e(String str, String str2, String str3) {
        if (str2 != null) {
            return UUID.nameUUIDFromBytes(androidx.activity.m.d(str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11318e);
        sb.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sb.append(str2 == null ? "null" : "not null");
        sb.append(", hashKey is ");
        sb.append("not null");
        throw new IllegalArgumentException(sb.toString());
    }
}
