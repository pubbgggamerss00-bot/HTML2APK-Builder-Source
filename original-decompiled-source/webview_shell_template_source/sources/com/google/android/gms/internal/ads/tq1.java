package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class tq1 {

    /* renamed from: b, reason: collision with root package name */
    public static final tq1 f9368b = new tq1(new a("Failure occurred while trying to finish a future."));

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f9369a;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends Throwable {
        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public tq1(Throwable th) {
        th.getClass();
        this.f9369a = th;
    }
}
