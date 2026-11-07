package com.google.android.play.core.integrity;

/* loaded from: classes2.dex */
final class a extends ap {

    /* renamed from: a, reason: collision with root package name */
    private String f6485a;

    /* renamed from: b, reason: collision with root package name */
    private y f6486b;

    @Override // com.google.android.play.core.integrity.ap
    public final ap a(y yVar) {
        this.f6486b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    public final ap b(String str) {
        this.f6485a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    public final aq c() {
        y yVar;
        String str = this.f6485a;
        if (str != null && (yVar = this.f6486b) != null) {
            return new aq(str, yVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f6485a == null) {
            sb.append(" token");
        }
        if (this.f6486b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
