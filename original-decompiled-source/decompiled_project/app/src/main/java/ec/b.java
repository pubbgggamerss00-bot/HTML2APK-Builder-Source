package ec;

import com.google.android.play.core.install.InstallState;

/* loaded from: classes2.dex */
public final class b extends InstallState {

    /* renamed from: a, reason: collision with root package name */
    public final int f8661a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8662b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8663c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8664d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8665e;

    public b(int i10, long j10, long j11, int i11, String str) {
        this.f8661a = i10;
        this.f8662b = j10;
        this.f8663c = j11;
        this.f8664d = i11;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.f8665e = str;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long a() {
        return this.f8662b;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int b() {
        return this.f8664d;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int c() {
        return this.f8661a;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final String d() {
        return this.f8665e;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long e() {
        return this.f8663c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallState)) {
            return false;
        }
        InstallState installState = (InstallState) obj;
        return this.f8661a == installState.c() && this.f8662b == installState.a() && this.f8663c == installState.e() && this.f8664d == installState.b() && this.f8665e.equals(installState.d());
    }

    public final int hashCode() {
        int i10 = this.f8661a ^ 1000003;
        long j10 = this.f8662b;
        long j11 = this.f8663c;
        return (((((((i10 * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f8664d) * 1000003) ^ this.f8665e.hashCode();
    }

    public final String toString() {
        return "InstallState{installStatus=" + this.f8661a + ", bytesDownloaded=" + this.f8662b + ", totalBytesToDownload=" + this.f8663c + ", installErrorCode=" + this.f8664d + ", packageName=" + this.f8665e + "}";
    }
}
