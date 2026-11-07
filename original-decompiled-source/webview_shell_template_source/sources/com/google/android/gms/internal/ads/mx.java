package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mx implements r70, zr1 {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public Object f7232t;

    /* renamed from: u, reason: collision with root package name */
    public Object f7233u;

    /* renamed from: v, reason: collision with root package name */
    public Object f7234v;

    /* renamed from: w, reason: collision with root package name */
    public Object f7235w;

    public /* synthetic */ mx(int i6) {
        this.s = i6;
        switch (i6) {
            case 3:
                this.f7232t = null;
                this.f7233u = null;
                this.f7234v = null;
                this.f7235w = pz1.f8185e;
                break;
            case 4:
                break;
            default:
                this.f7232t = null;
                this.f7233u = null;
                this.f7234v = null;
                this.f7235w = tu1.f9377w;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public void mo2a(Object obj) {
        gs0 gs0Var = (gs0) this.f7235w;
        dz0 dz0Var = gs0Var.f5147i;
        vf0 vf0Var = (vf0) this.f7234v;
        xa0 xa0Var = (xa0) obj;
        tb1 tb1Var = (tb1) this.f7232t;
        xa0Var.s(tb1Var, (vb1) this.f7233u);
        eb0 eb0VarZzN = xa0Var.zzN();
        if (((Boolean) zzbe.zzc().a(zn.X9)).booleanValue() && eb0VarZzN != null) {
            eb0VarZzN.c(vf0Var, dz0Var, gs0Var.f5148j);
            eb0VarZzN.e(vf0Var, dz0Var, gs0Var.f5143d);
        }
        if (!((Boolean) zzbe.zzc().a(zn.Qc)).booleanValue() || eb0VarZzN == null) {
            return;
        }
        xa0 xa0Var2 = eb0VarZzN.s;
        if (zzv.zzo().e(xa0Var2.getContext())) {
            eb0VarZzN.f("/logScionEvent");
            new HashMap();
            eb0VarZzN.a("/logScionEvent", new cu(xa0Var2.getContext(), tb1Var.f9213w0));
        }
    }

    public void b() {
        this.f7233u = 12;
    }

    public void c(int i6) {
        switch (this.s) {
            case 2:
                if (i6 != 16 && i6 != 24 && i6 != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i6)));
                }
                this.f7232t = Integer.valueOf(i6);
                return;
            default:
                this.f7232t = Integer.valueOf(i6);
                return;
        }
    }

    public void d() {
        this.f7234v = 16;
    }

    public void e(int i6) {
        this.f7233u = Integer.valueOf(i6);
    }

    public uu1 f() {
        Integer num = (Integer) this.f7232t;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((Integer) this.f7233u) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((Integer) this.f7234v) == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        ((Integer) this.f7233u).getClass();
        ((Integer) this.f7234v).getClass();
        return new uu1(iIntValue, (tu1) this.f7235w);
    }

    public qz1 g() {
        Integer num = (Integer) this.f7232t;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (((Integer) this.f7233u) == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((oz1) this.f7234v) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f7232t));
        }
        Integer num2 = (Integer) this.f7233u;
        int iIntValue = num2.intValue();
        oz1 oz1Var = (oz1) this.f7234v;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (oz1Var == oz1.f7898b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (oz1Var == oz1.f7899c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (oz1Var == oz1.f7900d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (oz1Var == oz1.f7901e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (oz1Var != oz1.f7902f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new qz1(((Integer) this.f7232t).intValue(), ((Integer) this.f7233u).intValue(), (pz1) this.f7235w, (oz1) this.f7234v);
    }

    @Override // com.google.android.gms.internal.ads.r70, com.google.android.gms.internal.ads.om0
    /* renamed from: zza */
    public /* bridge */ /* synthetic */ void mo3zza(Object obj) throws JSONException {
        dx dxVar = (dx) obj;
        zze.zza("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.f7233u;
        o70 o70Var = (o70) this.f7234v;
        ox oxVar = (ox) this.f7235w;
        zw zwVar = (zw) this.f7232t;
        try {
            zzv.zzq();
            String string = UUID.randomUUID().toString();
            xt.f10680o.a(string, new nx(oxVar, zwVar, o70Var));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", oxVar.f7879b.a(obj2));
            dxVar.l0(oxVar.f7881d, jSONObject);
        } catch (Exception e6) {
            try {
                o70Var.b(e6);
                zzo.zzh("Unable to invokeJavascript", e6);
            } finally {
                zwVar.e();
            }
        }
    }

    public /* synthetic */ mx(Object obj, Object obj2, Object obj3, Object obj4, int i6) {
        this.s = i6;
        this.f7232t = obj2;
        this.f7233u = obj3;
        this.f7234v = obj4;
        this.f7235w = obj;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public void j(Throwable th) {
    }
}
