package com.google.android.play.core.integrity;

/* loaded from: classes2.dex */
final class b extends bq {

    /* renamed from: a, reason: collision with root package name */
    private String f6538a;

    /* renamed from: b, reason: collision with root package name */
    private y f6539b;

    @Override // com.google.android.play.core.integrity.bq
    public final bq a(y yVar) {
        this.f6539b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    public final bq b(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f6538a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    public final br c() {
        y yVar;
        String str = this.f6538a;
        if (str != null && (yVar = this.f6539b) != null) {
            return new br(str, yVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f6538a == null) {
            sb.append(" token");
        }
        if (this.f6539b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
