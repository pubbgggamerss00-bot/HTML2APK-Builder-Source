package sh;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final s0 f25088a;

    /* renamed from: b, reason: collision with root package name */
    public static final s0 f25089b;

    /* renamed from: c, reason: collision with root package name */
    public static final s0 f25090c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ s0[] f25091d;

    static {
        s0 s0Var = new s0("START", 0);
        f25088a = s0Var;
        s0 s0Var2 = new s0("STOP", 1);
        f25089b = s0Var2;
        s0 s0Var3 = new s0("STOP_AND_RESET_REPLAY_CACHE", 2);
        f25090c = s0Var3;
        s0[] s0VarArr = {s0Var, s0Var2, s0Var3};
        f25091d = s0VarArr;
        u2.e(s0VarArr);
    }

    public s0() {
        throw null;
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) f25091d.clone();
    }
}
