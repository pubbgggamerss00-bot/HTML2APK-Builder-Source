package db;

/* loaded from: classes2.dex */
public enum p implements a {
    /* JADX INFO: Fake field, exist only in values array */
    ED256(-260),
    /* JADX INFO: Fake field, exist only in values array */
    ED512(-261),
    /* JADX INFO: Fake field, exist only in values array */
    ED25519(-8),
    /* JADX INFO: Fake field, exist only in values array */
    ES256(-7),
    /* JADX INFO: Fake field, exist only in values array */
    ECDH_HKDF_256(-25),
    /* JADX INFO: Fake field, exist only in values array */
    ES384(-35),
    /* JADX INFO: Fake field, exist only in values array */
    ES512(-36);


    /* renamed from: a, reason: collision with root package name */
    public final int f7748a;

    p(int i10) {
        this.f7748a = i10;
    }

    @Override // db.a
    public final int a() {
        return this.f7748a;
    }
}
