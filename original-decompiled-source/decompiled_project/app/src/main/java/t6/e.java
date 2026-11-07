package t6;

import android.net.NetworkRequest;
import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: j, reason: collision with root package name */
    public static final e f28001j = new e();

    /* renamed from: a, reason: collision with root package name */
    public final t f28002a;

    /* renamed from: b, reason: collision with root package name */
    public final d7.o f28003b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28004c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28005d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f28006e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f28007f;

    /* renamed from: g, reason: collision with root package name */
    public final long f28008g;

    /* renamed from: h, reason: collision with root package name */
    public final long f28009h;

    /* renamed from: i, reason: collision with root package name */
    public final Set<a> f28010i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f28011a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f28012b;

        public a(boolean z10, Uri uri) {
            this.f28011a = uri;
            this.f28012b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!a.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            a aVar = (a) obj;
            return kotlin.jvm.internal.r.a(this.f28011a, aVar.f28011a) && this.f28012b == aVar.f28012b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f28012b) + (this.f28011a.hashCode() * 31);
        }
    }

    public e() {
        this.f28003b = new d7.o(null);
        this.f28002a = t.f28052a;
        this.f28004c = false;
        this.f28005d = false;
        this.f28006e = false;
        this.f28007f = false;
        this.f28008g = -1L;
        this.f28009h = -1L;
        this.f28010i = qg.b0.f22711a;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.f28003b.f7391a;
    }

    public final boolean b() {
        return !this.f28010i.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !e.class.equals(obj.getClass())) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f28004c == eVar.f28004c && this.f28005d == eVar.f28005d && this.f28006e == eVar.f28006e && this.f28007f == eVar.f28007f && this.f28008g == eVar.f28008g && this.f28009h == eVar.f28009h && kotlin.jvm.internal.r.a(a(), eVar.a()) && this.f28002a == eVar.f28002a) {
            return kotlin.jvm.internal.r.a(this.f28010i, eVar.f28010i);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f28002a.hashCode() * 31) + (this.f28004c ? 1 : 0)) * 31) + (this.f28005d ? 1 : 0)) * 31) + (this.f28006e ? 1 : 0)) * 31) + (this.f28007f ? 1 : 0)) * 31;
        long j10 = this.f28008g;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f28009h;
        int iHashCode2 = (this.f28010i.hashCode() + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31;
        NetworkRequest networkRequestA = a();
        return iHashCode2 + (networkRequestA != null ? networkRequestA.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.f28002a + ", requiresCharging=" + this.f28004c + ", requiresDeviceIdle=" + this.f28005d + ", requiresBatteryNotLow=" + this.f28006e + ", requiresStorageNotLow=" + this.f28007f + ", contentTriggerUpdateDelayMillis=" + this.f28008g + ", contentTriggerMaxDelayMillis=" + this.f28009h + ", contentUriTriggers=" + this.f28010i + ", }";
    }

    public e(d7.o oVar, t tVar, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, LinkedHashSet linkedHashSet) {
        this.f28003b = oVar;
        this.f28002a = tVar;
        this.f28004c = z10;
        this.f28005d = z11;
        this.f28006e = z12;
        this.f28007f = z13;
        this.f28008g = j10;
        this.f28009h = j11;
        this.f28010i = linkedHashSet;
    }

    public e(e other) {
        kotlin.jvm.internal.r.e(other, "other");
        this.f28004c = other.f28004c;
        this.f28005d = other.f28005d;
        this.f28003b = other.f28003b;
        this.f28002a = other.f28002a;
        this.f28006e = other.f28006e;
        this.f28007f = other.f28007f;
        this.f28010i = other.f28010i;
        this.f28008g = other.f28008g;
        this.f28009h = other.f28009h;
    }
}
