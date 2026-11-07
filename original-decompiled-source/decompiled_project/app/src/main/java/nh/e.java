package nh;

import i0.u2;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f18814b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f18815c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f18816d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f18817e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f18818f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f18819g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ e[] f18820h;

    /* renamed from: a, reason: collision with root package name */
    public final TimeUnit f18821a;

    static {
        e eVar = new e("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f18814b = eVar;
        e eVar2 = new e("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        e eVar3 = new e("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f18815c = eVar3;
        e eVar4 = new e("SECONDS", 3, TimeUnit.SECONDS);
        f18816d = eVar4;
        e eVar5 = new e("MINUTES", 4, TimeUnit.MINUTES);
        f18817e = eVar5;
        e eVar6 = new e("HOURS", 5, TimeUnit.HOURS);
        f18818f = eVar6;
        e eVar7 = new e("DAYS", 6, TimeUnit.DAYS);
        f18819g = eVar7;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7};
        f18820h = eVarArr;
        u2.e(eVarArr);
    }

    public e(String str, int i10, TimeUnit timeUnit) {
        this.f18821a = timeUnit;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f18820h.clone();
    }
}
