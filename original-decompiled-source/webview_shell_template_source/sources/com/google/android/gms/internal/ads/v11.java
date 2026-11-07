package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbs;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import k3.a;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class v11 implements f01 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9685a;

    /* renamed from: b, reason: collision with root package name */
    public final uo0 f9686b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f9687c;

    public v11(Context context, uo0 uo0Var, Executor executor) {
        this.f9685a = context;
        this.f9686b = uo0Var;
        this.f9687c = executor;
    }

    public static final boolean c(ac1 ac1Var, int i6) {
        return ((ec1) ac1Var.f2647a.f9702t).f4212g.contains(Integer.toString(i6));
    }

    @Override // com.google.android.gms.internal.ads.f01
    public final void a(ac1 ac1Var, tb1 tb1Var, b01 b01Var) throws JSONException, gc1, IOException {
        rc1 rc1Var = (rc1) b01Var.f2884b;
        ec1 ec1Var = (ec1) ac1Var.f2647a.f9702t;
        String string = tb1Var.f9210v.toString();
        String strZzm = zzbs.zzm(tb1Var.s);
        my myVar = (my) b01Var.f2885c;
        ec1 ec1Var2 = (ec1) ac1Var.f2647a.f9702t;
        Context context = this.f9685a;
        oq oqVar = ec1Var2.f4213i;
        ArrayList arrayList = ec1Var2.f4212g;
        try {
            rc1Var.f8609a.C(new k3.b(context), ec1Var.f4209d, string, strZzm, myVar, oqVar, arrayList);
        } catch (Throwable th) {
            throw new gc1(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0527  */
    @Override // com.google.android.gms.internal.ads.f01
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ac1 ac1Var, tb1 tb1Var, b01 b01Var) throws p21 {
        gc1 gc1Var;
        py pyVar;
        rc1 rc1Var;
        ty tyVar;
        qy qyVar;
        jp0 jp0VarE;
        qy qyVar2;
        ip0 ip0Var;
        sq sqVarI1;
        View view;
        String string;
        ArrayList arrayList;
        Object obj = b01Var.f2884b;
        try {
            py pyVarZzO = ((rc1) obj).f8609a.zzO();
            rc1 rc1Var2 = (rc1) obj;
            jy jyVar = rc1Var2.f8609a;
            try {
                qy qyVarP = jyVar.p();
                try {
                    ty tyVarZzk = jyVar.zzk();
                    if (tyVarZzk != null && c(ac1Var, 6)) {
                        jp0VarE = jp0.n(tyVarZzk);
                    } else {
                        if (pyVarZzO == null || !c(ac1Var, 6)) {
                            if (pyVarZzO == null || !c(ac1Var, 2)) {
                                pyVar = pyVarZzO;
                                rc1Var = rc1Var2;
                                tyVar = tyVarZzk;
                                if (qyVarP != null && c(ac1Var, 6)) {
                                    try {
                                        qyVar2 = qyVarP;
                                        try {
                                            Parcel parcelZzcZ = qyVar2.zzcZ(16, qyVarP.zza());
                                            zzeb zzebVarZzb = zzea.zzb(parcelZzcZ.readStrongBinder());
                                            parcelZzcZ.recycle();
                                            ip0 ip0Var2 = zzebVarZzb == null ? null : new ip0(zzebVarZzb, null);
                                            Parcel parcelZzcZ2 = qyVar2.zzcZ(19, qyVar2.zza());
                                            sq sqVarI12 = rq.i1(parcelZzcZ2.readStrongBinder());
                                            parcelZzcZ2.recycle();
                                            Parcel parcelZzcZ3 = qyVar2.zzcZ(15, qyVar2.zza());
                                            k3.a aVarR = a.AbstractBinderC0073a.r(parcelZzcZ3.readStrongBinder());
                                            parcelZzcZ3.recycle();
                                            View view2 = (View) jp0.f(aVarR);
                                            Parcel parcelZzcZ4 = qyVar2.zzcZ(2, qyVar2.zza());
                                            String string2 = parcelZzcZ4.readString();
                                            parcelZzcZ4.recycle();
                                            Parcel parcelZzcZ5 = qyVar2.zzcZ(3, qyVar2.zza());
                                            ArrayList arrayList2 = parcelZzcZ5.readArrayList(th.f9281a);
                                            parcelZzcZ5.recycle();
                                            Parcel parcelZzcZ6 = qyVar2.zzcZ(4, qyVar2.zza());
                                            String string3 = parcelZzcZ6.readString();
                                            parcelZzcZ6.recycle();
                                            Parcel parcelZzcZ7 = qyVar2.zzcZ(13, qyVar2.zza());
                                            Bundle bundle = (Bundle) th.a(parcelZzcZ7, Bundle.CREATOR);
                                            parcelZzcZ7.recycle();
                                            Parcel parcelZzcZ8 = qyVar2.zzcZ(6, qyVar2.zza());
                                            String string4 = parcelZzcZ8.readString();
                                            parcelZzcZ8.recycle();
                                            View view3 = (View) jp0.f(qyVar2.n());
                                            Parcel parcelZzcZ9 = qyVar2.zzcZ(21, qyVar2.zza());
                                            k3.a aVarR2 = a.AbstractBinderC0073a.r(parcelZzcZ9.readStrongBinder());
                                            parcelZzcZ9.recycle();
                                            Parcel parcelZzcZ10 = qyVar2.zzcZ(5, qyVar2.zza());
                                            yq yqVarI1 = mq.i1(parcelZzcZ10.readStrongBinder());
                                            parcelZzcZ10.recycle();
                                            Parcel parcelZzcZ11 = qyVar2.zzcZ(7, qyVar2.zza());
                                            String string5 = parcelZzcZ11.readString();
                                            parcelZzcZ11.recycle();
                                            jp0VarE = jp0.e(ip0Var2, sqVarI12, view2, string2, arrayList2, string3, bundle, string4, view3, aVarR2, null, null, -1.0d, yqVarI1, string5, 0.0f);
                                        } catch (RemoteException e6) {
                                            e = e6;
                                            zzo.zzk("Failed to get native ad assets from content ad mapper", e);
                                            jp0VarE = null;
                                            qyVar = qyVar2;
                                            if (jp0VarE != null) {
                                            }
                                            throw new p21(1, "No corresponding native ad listener");
                                        }
                                    } catch (RemoteException e7) {
                                        e = e7;
                                        qyVar2 = qyVarP;
                                    }
                                    qyVar = qyVar2;
                                } else {
                                    if (qyVarP == null || !c(ac1Var, 1)) {
                                        throw new p21(1, "No native ad mappers");
                                    }
                                    try {
                                        Parcel parcelZzcZ12 = qyVarP.zzcZ(16, qyVarP.zza());
                                        zzeb zzebVarZzb2 = zzea.zzb(parcelZzcZ12.readStrongBinder());
                                        parcelZzcZ12.recycle();
                                        ip0 ip0Var3 = zzebVarZzb2 == null ? null : new ip0(zzebVarZzb2, null);
                                        Parcel parcelZzcZ13 = qyVarP.zzcZ(19, qyVarP.zza());
                                        sq sqVarI13 = rq.i1(parcelZzcZ13.readStrongBinder());
                                        parcelZzcZ13.recycle();
                                        Parcel parcelZzcZ14 = qyVarP.zzcZ(15, qyVarP.zza());
                                        k3.a aVarR3 = a.AbstractBinderC0073a.r(parcelZzcZ14.readStrongBinder());
                                        parcelZzcZ14.recycle();
                                        View view4 = (View) jp0.f(aVarR3);
                                        Parcel parcelZzcZ15 = qyVarP.zzcZ(2, qyVarP.zza());
                                        String string6 = parcelZzcZ15.readString();
                                        parcelZzcZ15.recycle();
                                        Parcel parcelZzcZ16 = qyVarP.zzcZ(3, qyVarP.zza());
                                        ArrayList arrayList3 = parcelZzcZ16.readArrayList(th.f9281a);
                                        parcelZzcZ16.recycle();
                                        Parcel parcelZzcZ17 = qyVarP.zzcZ(4, qyVarP.zza());
                                        String string7 = parcelZzcZ17.readString();
                                        parcelZzcZ17.recycle();
                                        Parcel parcelZzcZ18 = qyVarP.zzcZ(13, qyVarP.zza());
                                        Bundle bundle2 = (Bundle) th.a(parcelZzcZ18, Bundle.CREATOR);
                                        parcelZzcZ18.recycle();
                                        Parcel parcelZzcZ19 = qyVarP.zzcZ(6, qyVarP.zza());
                                        String string8 = parcelZzcZ19.readString();
                                        parcelZzcZ19.recycle();
                                        View view5 = (View) jp0.f(qyVarP.n());
                                        Parcel parcelZzcZ20 = qyVarP.zzcZ(21, qyVarP.zza());
                                        k3.a aVarR4 = a.AbstractBinderC0073a.r(parcelZzcZ20.readStrongBinder());
                                        parcelZzcZ20.recycle();
                                        Parcel parcelZzcZ21 = qyVarP.zzcZ(7, qyVarP.zza());
                                        String string9 = parcelZzcZ21.readString();
                                        parcelZzcZ21.recycle();
                                        Parcel parcelZzcZ22 = qyVarP.zzcZ(5, qyVarP.zza());
                                        yq yqVarI12 = mq.i1(parcelZzcZ22.readStrongBinder());
                                        parcelZzcZ22.recycle();
                                        jp0 jp0Var = new jp0();
                                        qyVar = qyVarP;
                                        try {
                                            jp0Var.f6123a = 1;
                                            jp0Var.f6124b = ip0Var3;
                                            jp0Var.f6125c = sqVarI13;
                                            jp0Var.f6126d = view4;
                                            jp0Var.d("headline", string6);
                                            jp0Var.f6127e = arrayList3;
                                            jp0Var.d("body", string7);
                                            jp0Var.h = bundle2;
                                            jp0Var.d("call_to_action", string8);
                                            jp0Var.f6136o = view5;
                                            jp0Var.f6138q = aVarR4;
                                            jp0Var.d("advertiser", string9);
                                            jp0Var.f6140t = yqVarI12;
                                            jp0VarE = jp0Var;
                                        } catch (RemoteException e8) {
                                            e = e8;
                                            zzo.zzk("Failed to get native ad from content ad mapper", e);
                                            jp0VarE = null;
                                            if (jp0VarE != null) {
                                            }
                                            throw new p21(1, "No corresponding native ad listener");
                                        }
                                    } catch (RemoteException e9) {
                                        e = e9;
                                        qyVar = qyVarP;
                                    }
                                }
                            } else {
                                try {
                                    Parcel parcelZzcZ23 = pyVarZzO.zzcZ(17, pyVarZzO.zza());
                                    zzeb zzebVarZzb3 = zzea.zzb(parcelZzcZ23.readStrongBinder());
                                    parcelZzcZ23.recycle();
                                    ip0Var = zzebVarZzb3 == null ? null : new ip0(zzebVarZzb3, null);
                                    Parcel parcelZzcZ24 = pyVarZzO.zzcZ(19, pyVarZzO.zza());
                                    sqVarI1 = rq.i1(parcelZzcZ24.readStrongBinder());
                                    parcelZzcZ24.recycle();
                                    Parcel parcelZzcZ25 = pyVarZzO.zzcZ(18, pyVarZzO.zza());
                                    k3.a aVarR5 = a.AbstractBinderC0073a.r(parcelZzcZ25.readStrongBinder());
                                    parcelZzcZ25.recycle();
                                    view = (View) jp0.f(aVarR5);
                                    Parcel parcelZzcZ26 = pyVarZzO.zzcZ(2, pyVarZzO.zza());
                                    string = parcelZzcZ26.readString();
                                    parcelZzcZ26.recycle();
                                    Parcel parcelZzcZ27 = pyVarZzO.zzcZ(3, pyVarZzO.zza());
                                    arrayList = parcelZzcZ27.readArrayList(th.f9281a);
                                    parcelZzcZ27.recycle();
                                    rc1Var = rc1Var2;
                                } catch (RemoteException e10) {
                                    e = e10;
                                    pyVar = pyVarZzO;
                                    rc1Var = rc1Var2;
                                }
                                try {
                                    Parcel parcelZzcZ28 = pyVarZzO.zzcZ(4, pyVarZzO.zza());
                                    String string10 = parcelZzcZ28.readString();
                                    parcelZzcZ28.recycle();
                                    Parcel parcelZzcZ29 = pyVarZzO.zzcZ(15, pyVarZzO.zza());
                                    Bundle bundle3 = (Bundle) th.a(parcelZzcZ29, Bundle.CREATOR);
                                    parcelZzcZ29.recycle();
                                    tyVar = tyVarZzk;
                                    try {
                                        Parcel parcelZzcZ30 = pyVarZzO.zzcZ(6, pyVarZzO.zza());
                                        String string11 = parcelZzcZ30.readString();
                                        parcelZzcZ30.recycle();
                                        View view6 = (View) jp0.f(pyVarZzO.n());
                                        qyVar = qyVarP;
                                        try {
                                            Parcel parcelZzcZ31 = pyVarZzO.zzcZ(21, pyVarZzO.zza());
                                            k3.a aVarR6 = a.AbstractBinderC0073a.r(parcelZzcZ31.readStrongBinder());
                                            parcelZzcZ31.recycle();
                                            Parcel parcelZzcZ32 = pyVarZzO.zzcZ(8, pyVarZzO.zza());
                                            String string12 = parcelZzcZ32.readString();
                                            parcelZzcZ32.recycle();
                                            Parcel parcelZzcZ33 = pyVarZzO.zzcZ(9, pyVarZzO.zza());
                                            String string13 = parcelZzcZ33.readString();
                                            parcelZzcZ33.recycle();
                                            Parcel parcelZzcZ34 = pyVarZzO.zzcZ(7, pyVarZzO.zza());
                                            double d7 = parcelZzcZ34.readDouble();
                                            parcelZzcZ34.recycle();
                                            Parcel parcelZzcZ35 = pyVarZzO.zzcZ(5, pyVarZzO.zza());
                                            yq yqVarI13 = mq.i1(parcelZzcZ35.readStrongBinder());
                                            parcelZzcZ35.recycle();
                                            jp0 jp0Var2 = new jp0();
                                            pyVar = pyVarZzO;
                                            try {
                                                jp0Var2.f6123a = 2;
                                                jp0Var2.f6124b = ip0Var;
                                                jp0Var2.f6125c = sqVarI1;
                                                jp0Var2.f6126d = view;
                                                jp0Var2.d("headline", string);
                                                jp0Var2.f6127e = arrayList;
                                                jp0Var2.d("body", string10);
                                                jp0Var2.h = bundle3;
                                                jp0Var2.d("call_to_action", string11);
                                                jp0Var2.f6136o = view6;
                                                jp0Var2.f6138q = aVarR6;
                                                jp0Var2.d("store", string12);
                                                jp0Var2.d("price", string13);
                                                jp0Var2.f6139r = d7;
                                                jp0Var2.s = yqVarI13;
                                                jp0VarE = jp0Var2;
                                            } catch (RemoteException e11) {
                                                e = e11;
                                                zzo.zzk("Failed to get native ad from app install ad mapper", e);
                                                jp0VarE = null;
                                                if (jp0VarE != null) {
                                                }
                                                throw new p21(1, "No corresponding native ad listener");
                                            }
                                        } catch (RemoteException e12) {
                                            e = e12;
                                            pyVar = pyVarZzO;
                                        }
                                    } catch (RemoteException e13) {
                                        e = e13;
                                        pyVar = pyVarZzO;
                                        qyVar = qyVarP;
                                    }
                                } catch (RemoteException e14) {
                                    e = e14;
                                    pyVar = pyVarZzO;
                                    qyVar = qyVarP;
                                    tyVar = tyVarZzk;
                                    zzo.zzk("Failed to get native ad from app install ad mapper", e);
                                    jp0VarE = null;
                                    if (jp0VarE != null) {
                                    }
                                    throw new p21(1, "No corresponding native ad listener");
                                }
                            }
                            if (jp0VarE != null) {
                                if (((ec1) ac1Var.f2647a.f9702t).f4212g.contains(Integer.toString(jp0VarE.g()))) {
                                    ce0 ce0VarB = this.f9686b.b(new androidx.camera.view.b(ac1Var, tb1Var, b01Var.f2883a), new ck1(5, jp0VarE), new mq0(qyVar, pyVar, tyVar));
                                    ((e11) b01Var.f2885c).e2(new p31((nk0) ce0VarB.f3539w.zzb(), (nn0) ce0VarB.f3541y.zzb(), (yk0) ce0VarB.f3540x.zzb(), (fl0) ce0VarB.f3538v.zzb(), (hl0) ce0VarB.f3542z.zzb(), (gm0) ce0VarB.f3536t.f5691f0.zzb(), (rl0) ce0VarB.A.zzb(), (vn0) ce0VarB.B.zzb(), (em0) ce0VarB.C.zzb(), (vk0) ce0VarB.D.zzb()));
                                    ((dl0) ce0VarB.f3537u.zzb()).l0(new nf0(rc1Var), this.f9687c);
                                    return ce0VarB.r();
                                }
                            }
                            throw new p21(1, "No corresponding native ad listener");
                        }
                        try {
                            Parcel parcelZzcZ36 = pyVarZzO.zzcZ(17, pyVarZzO.zza());
                            zzeb zzebVarZzb4 = zzea.zzb(parcelZzcZ36.readStrongBinder());
                            parcelZzcZ36.recycle();
                            ip0 ip0Var4 = zzebVarZzb4 == null ? null : new ip0(zzebVarZzb4, null);
                            Parcel parcelZzcZ37 = pyVarZzO.zzcZ(19, pyVarZzO.zza());
                            sq sqVarI14 = rq.i1(parcelZzcZ37.readStrongBinder());
                            parcelZzcZ37.recycle();
                            Parcel parcelZzcZ38 = pyVarZzO.zzcZ(18, pyVarZzO.zza());
                            k3.a aVarR7 = a.AbstractBinderC0073a.r(parcelZzcZ38.readStrongBinder());
                            parcelZzcZ38.recycle();
                            View view7 = (View) jp0.f(aVarR7);
                            Parcel parcelZzcZ39 = pyVarZzO.zzcZ(2, pyVarZzO.zza());
                            String string14 = parcelZzcZ39.readString();
                            parcelZzcZ39.recycle();
                            Parcel parcelZzcZ40 = pyVarZzO.zzcZ(3, pyVarZzO.zza());
                            ArrayList arrayList4 = parcelZzcZ40.readArrayList(th.f9281a);
                            parcelZzcZ40.recycle();
                            Parcel parcelZzcZ41 = pyVarZzO.zzcZ(4, pyVarZzO.zza());
                            String string15 = parcelZzcZ41.readString();
                            parcelZzcZ41.recycle();
                            Parcel parcelZzcZ42 = pyVarZzO.zzcZ(15, pyVarZzO.zza());
                            Bundle bundle4 = (Bundle) th.a(parcelZzcZ42, Bundle.CREATOR);
                            parcelZzcZ42.recycle();
                            Parcel parcelZzcZ43 = pyVarZzO.zzcZ(6, pyVarZzO.zza());
                            String string16 = parcelZzcZ43.readString();
                            parcelZzcZ43.recycle();
                            View view8 = (View) jp0.f(pyVarZzO.n());
                            Parcel parcelZzcZ44 = pyVarZzO.zzcZ(21, pyVarZzO.zza());
                            k3.a aVarR8 = a.AbstractBinderC0073a.r(parcelZzcZ44.readStrongBinder());
                            parcelZzcZ44.recycle();
                            Parcel parcelZzcZ45 = pyVarZzO.zzcZ(8, pyVarZzO.zza());
                            String string17 = parcelZzcZ45.readString();
                            parcelZzcZ45.recycle();
                            Parcel parcelZzcZ46 = pyVarZzO.zzcZ(9, pyVarZzO.zza());
                            String string18 = parcelZzcZ46.readString();
                            parcelZzcZ46.recycle();
                            Parcel parcelZzcZ47 = pyVarZzO.zzcZ(7, pyVarZzO.zza());
                            double d8 = parcelZzcZ47.readDouble();
                            parcelZzcZ47.recycle();
                            Parcel parcelZzcZ48 = pyVarZzO.zzcZ(5, pyVarZzO.zza());
                            yq yqVarI14 = mq.i1(parcelZzcZ48.readStrongBinder());
                            parcelZzcZ48.recycle();
                            jp0VarE = jp0.e(ip0Var4, sqVarI14, view7, string14, arrayList4, string15, bundle4, string16, view8, aVarR8, string17, string18, d8, yqVarI14, null, 0.0f);
                        } catch (RemoteException e15) {
                            zzo.zzk("Failed to get native ad assets from app install ad mapper", e15);
                            jp0VarE = null;
                        }
                    }
                    pyVar = pyVarZzO;
                    rc1Var = rc1Var2;
                    qyVar = qyVarP;
                    tyVar = tyVarZzk;
                    if (jp0VarE != null) {
                    }
                    throw new p21(1, "No corresponding native ad listener");
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }
}
