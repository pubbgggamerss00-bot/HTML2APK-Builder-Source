package androidx.room;

/* loaded from: classes.dex */
public abstract class j0 implements k0 {
    private final String identityHash;
    private final String legacyIdentityHash;
    private final int version;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f3004a;

        /* renamed from: b, reason: collision with root package name */
        public final String f3005b;

        public a(boolean z10, String str) {
            this.f3004a = z10;
            this.f3005b = str;
        }
    }

    public j0(int i10, String identityHash, String legacyIdentityHash) {
        kotlin.jvm.internal.r.e(identityHash, "identityHash");
        kotlin.jvm.internal.r.e(legacyIdentityHash, "legacyIdentityHash");
        this.version = i10;
        this.identityHash = identityHash;
        this.legacyIdentityHash = legacyIdentityHash;
    }

    public abstract void createAllTables(h6.b bVar);

    public abstract void dropAllTables(h6.b bVar);

    public final String getIdentityHash() {
        return this.identityHash;
    }

    public final String getLegacyIdentityHash() {
        return this.legacyIdentityHash;
    }

    public final int getVersion() {
        return this.version;
    }

    public abstract void onCreate(h6.b bVar);

    public abstract void onOpen(h6.b bVar);

    public abstract void onPostMigrate(h6.b bVar);

    public abstract void onPreMigrate(h6.b bVar);

    public abstract a onValidateSchema(h6.b bVar);
}
