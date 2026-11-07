package db;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class g extends j {
    public static final Parcelable.Creator<g> CREATOR = new v1();

    /* renamed from: a, reason: collision with root package name */
    public final zzgx f7717a;

    /* renamed from: b, reason: collision with root package name */
    public final zzgx f7718b;

    /* renamed from: c, reason: collision with root package name */
    public final zzgx f7719c;

    /* renamed from: d, reason: collision with root package name */
    public final zzgx f7720d;

    /* renamed from: e, reason: collision with root package name */
    public final zzgx f7721e;

    public g(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        com.google.android.gms.common.internal.p.f(bArr);
        zzgx zzgxVarZzl = zzgx.zzl(bArr, 0, bArr.length);
        com.google.android.gms.common.internal.p.f(bArr2);
        zzgx zzgxVarZzl2 = zzgx.zzl(bArr2, 0, bArr2.length);
        com.google.android.gms.common.internal.p.f(bArr3);
        zzgx zzgxVarZzl3 = zzgx.zzl(bArr3, 0, bArr3.length);
        com.google.android.gms.common.internal.p.f(bArr4);
        zzgx zzgxVarZzl4 = zzgx.zzl(bArr4, 0, bArr4.length);
        zzgx zzgxVarZzl5 = bArr5 == null ? null : zzgx.zzl(bArr5, 0, bArr5.length);
        com.google.android.gms.common.internal.p.f(zzgxVarZzl);
        this.f7717a = zzgxVarZzl;
        com.google.android.gms.common.internal.p.f(zzgxVarZzl2);
        this.f7718b = zzgxVarZzl2;
        com.google.android.gms.common.internal.p.f(zzgxVarZzl3);
        this.f7719c = zzgxVarZzl3;
        com.google.android.gms.common.internal.p.f(zzgxVarZzl4);
        this.f7720d = zzgxVarZzl4;
        this.f7721e = zzgxVarZzl5;
    }

    public final JSONObject d() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", p9.d.c(this.f7718b.zzm()));
            jSONObject.put("authenticatorData", p9.d.c(this.f7719c.zzm()));
            jSONObject.put("signature", p9.d.c(this.f7720d.zzm()));
            zzgx zzgxVar = this.f7721e;
            if (zzgxVar == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", p9.d.c(zzgxVar == null ? null : zzgxVar.zzm()));
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return com.google.android.gms.common.internal.o.a(this.f7717a, gVar.f7717a) && com.google.android.gms.common.internal.o.a(this.f7718b, gVar.f7718b) && com.google.android.gms.common.internal.o.a(this.f7719c, gVar.f7719c) && com.google.android.gms.common.internal.o.a(this.f7720d, gVar.f7720d) && com.google.android.gms.common.internal.o.a(this.f7721e, gVar.f7721e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f7717a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f7718b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f7719c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f7720d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f7721e}))});
    }

    public final String toString() {
        zzbi zzbiVarZza = zzbj.zza(this);
        zzgf zzgfVarZzf = zzgf.zzf();
        byte[] bArrZzm = this.f7717a.zzm();
        zzbiVarZza.zzb("keyHandle", zzgfVarZzf.zzg(bArrZzm, 0, bArrZzm.length));
        zzgf zzgfVarZzf2 = zzgf.zzf();
        byte[] bArrZzm2 = this.f7718b.zzm();
        zzbiVarZza.zzb("clientDataJSON", zzgfVarZzf2.zzg(bArrZzm2, 0, bArrZzm2.length));
        zzgf zzgfVarZzf3 = zzgf.zzf();
        byte[] bArrZzm3 = this.f7719c.zzm();
        zzbiVarZza.zzb("authenticatorData", zzgfVarZzf3.zzg(bArrZzm3, 0, bArrZzm3.length));
        zzgf zzgfVarZzf4 = zzgf.zzf();
        byte[] bArrZzm4 = this.f7720d.zzm();
        zzbiVarZza.zzb("signature", zzgfVarZzf4.zzg(bArrZzm4, 0, bArrZzm4.length));
        zzgx zzgxVar = this.f7721e;
        byte[] bArrZzm5 = zzgxVar == null ? null : zzgxVar.zzm();
        if (bArrZzm5 != null) {
            zzbiVarZza.zzb("userHandle", zzgf.zzf().zzg(bArrZzm5, 0, bArrZzm5.length));
        }
        return zzbiVarZza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.f(parcel, 2, this.f7717a.zzm(), false);
        androidx.lifecycle.c1.f(parcel, 3, this.f7718b.zzm(), false);
        androidx.lifecycle.c1.f(parcel, 4, this.f7719c.zzm(), false);
        androidx.lifecycle.c1.f(parcel, 5, this.f7720d.zzm(), false);
        zzgx zzgxVar = this.f7721e;
        androidx.lifecycle.c1.f(parcel, 6, zzgxVar == null ? null : zzgxVar.zzm(), false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
