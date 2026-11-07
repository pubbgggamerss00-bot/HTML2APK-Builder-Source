package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class m1 implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final MessageLite f2097a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2098b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f2099c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2100d;

    public m1(MessageLite messageLite, String str, Object[] objArr) {
        this.f2097a = messageLite;
        this.f2098b = str;
        this.f2099c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f2100d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f2100d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final MessageLite getDefaultInstance() {
        return this.f2097a;
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final j1 getSyntax() {
        int i10 = this.f2100d;
        return (i10 & 1) != 0 ? j1.f2044a : (i10 & 4) == 4 ? j1.f2046c : j1.f2045b;
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final boolean isMessageSetWireFormat() {
        return (this.f2100d & 2) == 2;
    }
}
