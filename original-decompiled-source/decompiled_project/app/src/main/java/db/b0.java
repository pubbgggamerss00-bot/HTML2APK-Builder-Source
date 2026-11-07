package db;

/* loaded from: classes2.dex */
public enum b0 implements a {
    /* JADX INFO: Fake field, exist only in values array */
    RS256(-257),
    /* JADX INFO: Fake field, exist only in values array */
    RS384(-258),
    /* JADX INFO: Fake field, exist only in values array */
    RS512(-259),
    /* JADX INFO: Fake field, exist only in values array */
    LEGACY_RS1(-262),
    /* JADX INFO: Fake field, exist only in values array */
    PS256(-37),
    /* JADX INFO: Fake field, exist only in values array */
    PS384(-38),
    /* JADX INFO: Fake field, exist only in values array */
    PS512(-39),
    RS1(-65535);


    /* renamed from: a, reason: collision with root package name */
    public final int f7679a;

    b0(int i10) {
        this.f7679a = i10;
    }

    @Override // db.a
    public final int a() {
        return this.f7679a;
    }
}
