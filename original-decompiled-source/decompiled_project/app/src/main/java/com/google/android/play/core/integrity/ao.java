package com.google.android.play.core.integrity;

/* loaded from: classes2.dex */
final class ao extends IntegrityTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    private final String f6517a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f6518b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f6519c = null;

    public /* synthetic */ ao(String str, Long l10, Object obj, an anVar) {
        this.f6517a = str;
        this.f6518b = l10;
    }

    private static boolean a() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f6518b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z10;
        Long l10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            z10 = this.f6517a.equals(integrityTokenRequest.nonce()) && ((l10 = this.f6518b) != null ? l10.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() == null);
        }
        return ((obj instanceof ao) && a()) ? z10 : z10;
    }

    public final int hashCode() {
        int iHashCode = this.f6517a.hashCode() ^ 1000003;
        Long l10 = this.f6518b;
        int iHashCode2 = (iHashCode * 1000003) ^ (l10 == null ? 0 : l10.hashCode());
        return a() ? iHashCode2 * 1000003 : iHashCode2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f6517a;
    }

    public final String toString() {
        String strConcat = "IntegrityTokenRequest{nonce=" + this.f6517a + ", cloudProjectNumber=" + this.f6518b;
        if (a()) {
            strConcat = strConcat.concat(", network=null");
        }
        return strConcat.concat("}");
    }
}
