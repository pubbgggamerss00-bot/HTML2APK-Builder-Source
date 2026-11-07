package ie;

import id.e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public File f14516a;

    /* renamed from: b, reason: collision with root package name */
    public final e f14517b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14518a;

        /* renamed from: b, reason: collision with root package name */
        public static final a f14519b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f14520c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f14521d;

        /* renamed from: e, reason: collision with root package name */
        public static final a f14522e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ a[] f14523f;

        static {
            a aVar = new a("ATTEMPT_MIGRATION", 0);
            f14518a = aVar;
            a aVar2 = new a("NOT_GENERATED", 1);
            f14519b = aVar2;
            a aVar3 = new a("UNREGISTERED", 2);
            f14520c = aVar3;
            a aVar4 = new a("REGISTERED", 3);
            f14521d = aVar4;
            a aVar5 = new a("REGISTER_ERROR", 4);
            f14522e = aVar5;
            f14523f = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f14523f.clone();
        }
    }

    public c(e eVar) {
        this.f14517b = eVar;
    }

    public final File a() {
        if (this.f14516a == null) {
            synchronized (this) {
                try {
                    if (this.f14516a == null) {
                        e eVar = this.f14517b;
                        eVar.a();
                        this.f14516a = new File(eVar.f14480a.getFilesDir(), "PersistedInstallation." + this.f14517b.f() + ".json");
                    }
                } finally {
                }
            }
        }
        return this.f14516a;
    }

    public final void b(ie.a aVar) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f14499b);
            jSONObject.put("Status", aVar.f14500c.ordinal());
            jSONObject.put("AuthToken", aVar.f14501d);
            jSONObject.put("RefreshToken", aVar.f14502e);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f14504g);
            jSONObject.put("ExpiresInSecs", aVar.f14503f);
            jSONObject.put("FisError", aVar.f14505h);
            e eVar = this.f14517b;
            eVar.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", eVar.f14480a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(a())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public final ie.a c() throws IOException {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                try {
                    int i10 = fileInputStream.read(bArr, 0, 16384);
                    if (i10 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i11 = d.f14524a;
        a aVar = a.values()[iOptInt];
        if (aVar != null) {
            return new ie.a(strOptString, aVar, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        throw new NullPointerException("Null registrationStatus");
    }
}
