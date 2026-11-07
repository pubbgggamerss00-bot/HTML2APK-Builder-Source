package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ht1 {

    /* renamed from: a, reason: collision with root package name */
    public final c22 f5480a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5481b;

    /* renamed from: c, reason: collision with root package name */
    public final jx1 f5482c;

    public /* synthetic */ ht1(c22 c22Var, ArrayList arrayList, jx1 jx1Var) {
        this.f5480a = c22Var;
        this.f5481b = arrayList;
        this.f5482c = jx1Var;
    }

    public static final ht1 a(lt1 lt1Var) {
        int i6;
        int i7;
        ft1 ft1Var = new ft1();
        et1 et1Var = new et1(lt1Var);
        y5 y5Var = y5.Y;
        et1Var.f4394c = y5Var;
        char c7 = 1;
        et1Var.f4392a = true;
        ArrayList arrayList = ft1Var.f4777a;
        int size = arrayList.size();
        int i8 = 0;
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((et1) obj).f4392a = false;
        }
        arrayList.add(et1Var);
        if (ft1Var.f4779c) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        ft1Var.f4779c = true;
        z12 z12VarD = c22.D();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int i10 = 0;
        while (i10 < arrayList.size() - 1) {
            int i11 = i10 + 1;
            if (((et1) arrayList.get(i10)).f4394c == y5Var && ((et1) arrayList.get(i11)).f4394c != y5Var) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i10 = i11;
        }
        HashSet hashSet = new HashSet();
        int size2 = arrayList.size();
        int i12 = 0;
        Integer num = null;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            et1 et1Var2 = (et1) obj2;
            et1Var2.getClass();
            lt1 lt1Var2 = et1Var2.f4393b;
            y5 y5Var2 = et1Var2.f4394c;
            if (y5Var2 == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i13 = i8;
            int i14 = 4;
            if (y5Var2 == y5Var) {
                i6 = i13;
                while (true) {
                    if (i6 != 0 && !hashSet.contains(Integer.valueOf(i6))) {
                        break;
                    }
                    SecureRandom secureRandom = new SecureRandom();
                    byte[] bArr = new byte[i14];
                    int i15 = i13;
                    while (i15 == 0) {
                        secureRandom.nextBytes(bArr);
                        i15 = ((bArr[2] & 255) << 8) | ((bArr[i13] & 255) << 24) | ((bArr[c7] & 255) << 16) | (bArr[3] & 255);
                        y5Var = y5Var;
                        c7 = 1;
                        i14 = 4;
                    }
                    i6 = i15;
                }
            } else {
                i6 = i13;
            }
            y5 y5Var3 = y5Var;
            Integer numValueOf = Integer.valueOf(i6);
            if (hashSet.contains(numValueOf)) {
                throw new GeneralSecurityException(androidx.camera.camera2.internal.s0.a(i6, "Id ", " is used twice in the keyset"));
            }
            hashSet.add(numValueOf);
            ih1 ih1VarA = px1.f8174b.a(lt1Var2, true != lt1Var2.a() ? null : numValueOf);
            Object obj3 = dt1.f4020u;
            gt1 gt1Var = new gt1(ih1VarA);
            oy1 oy1Var = (oy1) wx1.f10304b.c(ih1VarA);
            Integer num2 = oy1Var.f7890f;
            if (num2 != null && num2.intValue() != i6) {
                throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
            }
            if (obj3.equals(obj3)) {
                i7 = 3;
            } else if (dt1.f4021v.equals(obj3)) {
                i7 = 4;
            } else {
                if (!dt1.f4022w.equals(obj3)) {
                    throw new IllegalStateException("Unknown key status");
                }
                i7 = 5;
            }
            a22 a22VarD = b22.D();
            u12 u12VarB = v12.B();
            String str = oy1Var.f7885a;
            u12VarB.i();
            ArrayList arrayList3 = arrayList;
            v12.H((v12) u12VarB.f4126t, str);
            g42 g42Var = oy1Var.f7887c;
            u12VarB.i();
            v12.I((v12) u12VarB.f4126t, g42Var);
            int i16 = oy1Var.f7888d;
            u12VarB.i();
            v12.G((v12) u12VarB.f4126t, i16);
            a22VarD.i();
            b22.F((b22) a22VarD.f4126t, (v12) u12VarB.g());
            a22VarD.i();
            b22.K((b22) a22VarD.f4126t, i7);
            a22VarD.i();
            ((b22) a22VarD.f4126t).zzf = i6;
            q22 q22Var = oy1Var.f7889e;
            a22VarD.i();
            ((b22) a22VarD.f4126t).zzg = q22Var.zza();
            b22 b22Var = (b22) a22VarD.g();
            z12VarD.i();
            c22.H((c22) z12VarD.f4126t, b22Var);
            if (et1Var2.f4392a) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                num = numValueOf;
            }
            arrayList2.add(gt1Var);
            i8 = i13;
            arrayList = arrayList3;
            y5Var = y5Var3;
            c7 = 1;
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        int iIntValue = num.intValue();
        z12VarD.i();
        ((c22) z12VarD.f4126t).zzc = iIntValue;
        c22 c22Var = (c22) z12VarD.g();
        if (c22Var.B() > 0) {
            return new ht1(c22Var, arrayList2, ft1Var.f4778b);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public final Object b(me meVar) throws GeneralSecurityException {
        Class clsB = meVar.b();
        if (clsB == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(ys1.class.getName()));
        }
        int i6 = qt1.f8454a;
        c22 c22Var = this.f5480a;
        int iC = c22Var.C();
        int i7 = 0;
        boolean z6 = false;
        boolean z7 = true;
        for (b22 b22Var : c22Var.G()) {
            if (b22Var.J() == 3) {
                if (!b22Var.I()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(b22Var.B())));
                }
                if (b22Var.E() == q22.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(b22Var.B())));
                }
                if (b22Var.J() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(b22Var.B())));
                }
                if (b22Var.B() == iC) {
                    if (z6) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z6 = true;
                }
                z7 &= b22Var.C().C() == 4;
                i7++;
            }
        }
        if (i7 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z6 && !z7) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        ly1 ly1Var = new ly1(clsB);
        if (ly1Var.f6880b == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        ly1Var.f6883e = this.f5482c;
        int i8 = 0;
        while (true) {
            List list = this.f5481b;
            if (i8 >= list.size()) {
                HashMap map = ly1Var.f6880b;
                if (map == null) {
                    throw new IllegalStateException("build cannot be called twice");
                }
                my1 my1Var = ly1Var.f6882d;
                jx1 jx1Var = ly1Var.f6883e;
                eu euVar = new eu();
                euVar.f4395t = map;
                euVar.f4396u = my1Var;
                euVar.s = ly1Var.f6879a;
                euVar.f4397v = jx1Var;
                ly1Var.f6880b = null;
                return meVar.n(euVar);
            }
            b22 b22VarE = c22Var.E(i8);
            if (b22VarE.J() == 3) {
                gt1 gt1Var = (gt1) list.get(i8);
                if (gt1Var == null) {
                    throw new GeneralSecurityException("Key parsing of key with index " + i8 + " and type_url " + b22VarE.C().F() + " failed, unable to get primitive");
                }
                try {
                    Object objJ = meVar.j(gt1Var.f5158a, clsB);
                    if (b22VarE.B() == c22Var.C()) {
                        ly1Var.a(objJ, b22VarE, true);
                    } else {
                        ly1Var.a(objJ, b22VarE, false);
                    }
                } catch (GeneralSecurityException e6) {
                    throw new GeneralSecurityException("Unable to get primitive " + clsB.toString() + " for key of type " + b22VarE.C().F() + ", see https://developers.google.com/tink/faq/registration_errors", e6);
                }
            }
            i8++;
        }
    }

    public final String toString() {
        int i6 = qt1.f8454a;
        d22 d22VarB = h22.B();
        c22 c22Var = this.f5480a;
        int iC = c22Var.C();
        d22VarB.i();
        ((h22) d22VarB.f4126t).zzc = iC;
        for (b22 b22Var : c22Var.G()) {
            e22 e22VarB = g22.B();
            String strF = b22Var.C().F();
            e22VarB.i();
            g22.E((g22) e22VarB.f4126t, strF);
            int iJ = b22Var.J();
            e22VarB.i();
            g22.F((g22) e22VarB.f4126t, iJ);
            q22 q22VarE = b22Var.E();
            e22VarB.i();
            ((g22) e22VarB.f4126t).zzf = q22VarE.zza();
            int iB = b22Var.B();
            e22VarB.i();
            ((g22) e22VarB.f4126t).zze = iB;
            g22 g22Var = (g22) e22VarB.g();
            d22VarB.i();
            h22.C((h22) d22VarB.f4126t, g22Var);
        }
        return ((h22) d22VarB.g()).toString();
    }

    public ht1(c22 c22Var, List list) {
        this.f5480a = c22Var;
        this.f5481b = list;
        this.f5482c = jx1.f6188b;
    }
}
