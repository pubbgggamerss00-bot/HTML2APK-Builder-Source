package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.zza;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f8187t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f8188u;

    public /* synthetic */ q(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f8187t = obj;
        this.f8188u = obj2;
    }

    private final void a() {
        n00 n00Var;
        ie1 ie1Var = (ie1) this.f8187t;
        fe1 fe1Var = (fe1) this.f8188u;
        synchronized (ie1.C) {
            try {
                if (!ie1Var.f5731z) {
                    ie1Var.f5731z = true;
                    if (ie1.a()) {
                        try {
                            zzv.zzq();
                            ie1Var.f5727v = zzs.zzq(ie1Var.s);
                        } catch (RemoteException | RuntimeException e6) {
                            zzv.zzp().h("CuiMonitor.gettingAppIdFromManifest", e6);
                        }
                        c3.h hVar = c3.h.f2184b;
                        Context context = ie1Var.s;
                        hVar.getClass();
                        ie1Var.f5728w = c3.h.a(context);
                        int iIntValue = ((Integer) zzbe.zzc().a(zn.E8)).intValue();
                        if (((Boolean) zzbe.zzc().a(zn.Kb)).booleanValue()) {
                            long j6 = iIntValue;
                            i70.f5589d.scheduleWithFixedDelay(ie1Var, j6, j6, TimeUnit.MILLISECONDS);
                        } else {
                            long j7 = iIntValue;
                            i70.f5589d.scheduleAtFixedRate(ie1Var, j7, j7, TimeUnit.MILLISECONDS);
                        }
                    }
                }
            } finally {
            }
        }
        if (ie1.a() && fe1Var != null) {
            synchronized (ie1.B) {
                try {
                    if (((pe1) ie1Var.f5726u.f4126t).B() >= ((Integer) zzbe.zzc().a(zn.F8)).intValue()) {
                        return;
                    }
                    je1 je1VarB = le1.B();
                    int i6 = fe1Var.f4638m;
                    je1VarB.i();
                    ((le1) je1VarB.f4126t).zzd = i6 - 2;
                    boolean z6 = fe1Var.f4628b;
                    je1VarB.i();
                    ((le1) je1VarB.f4126t).zzk = z6;
                    long j8 = fe1Var.f4627a;
                    je1VarB.i();
                    ((le1) je1VarB.f4126t).zzl = j8;
                    je1VarB.i();
                    ((le1) je1VarB.f4126t).zzp = 1;
                    String str = ie1Var.f5725t.afmaVersion;
                    je1VarB.i();
                    le1.P((le1) je1VarB.f4126t, str);
                    String str2 = ie1Var.f5727v;
                    je1VarB.i();
                    le1.D((le1) je1VarB.f4126t, str2);
                    String str3 = Build.VERSION.RELEASE;
                    je1VarB.i();
                    le1.M((le1) je1VarB.f4126t);
                    int i7 = Build.VERSION.SDK_INT;
                    je1VarB.i();
                    ((le1) je1VarB.f4126t).zzA = i7;
                    int i8 = fe1Var.f4640o;
                    je1VarB.i();
                    le1.X((le1) je1VarB.f4126t, i8);
                    int i9 = fe1Var.f4629c;
                    je1VarB.i();
                    ((le1) je1VarB.f4126t).zzG = i9;
                    long j9 = ie1Var.f5728w;
                    je1VarB.i();
                    ((le1) je1VarB.f4126t).zzH = j9;
                    int i10 = fe1Var.f4639n;
                    je1VarB.i();
                    le1.V((le1) je1VarB.f4126t, i10);
                    String str4 = fe1Var.f4630d;
                    je1VarB.i();
                    le1.E((le1) je1VarB.f4126t, str4);
                    String str5 = fe1Var.f4631e;
                    je1VarB.i();
                    le1.H((le1) je1VarB.f4126t, str5);
                    String str6 = fe1Var.f4632f;
                    je1VarB.i();
                    le1.J((le1) je1VarB.f4126t, str6);
                    kt0 kt0VarA = ie1Var.f5729x.a(fe1Var.f4632f);
                    String string = (kt0VarA == null || (n00Var = kt0VarA.f6488b) == null) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : n00Var.toString();
                    je1VarB.i();
                    ((le1) je1VarB.f4126t).zzW = string;
                    String str7 = fe1Var.f4633g;
                    je1VarB.i();
                    le1.N((le1) je1VarB.f4126t, str7);
                    ke1 ke1Var = fe1Var.h;
                    je1VarB.i();
                    ((le1) je1VarB.f4126t).zzah = ke1Var.zza();
                    String str8 = fe1Var.f4636k;
                    je1VarB.i();
                    le1.F((le1) je1VarB.f4126t, str8);
                    String str9 = fe1Var.f4634i;
                    je1VarB.i();
                    le1.U((le1) je1VarB.f4126t, str9);
                    String str10 = fe1Var.f4635j;
                    je1VarB.i();
                    ((le1) je1VarB.f4126t).zzZ = str10;
                    long j10 = fe1Var.f4637l;
                    je1VarB.i();
                    ((le1) je1VarB.f4126t).zzm = j10;
                    if (((Boolean) zzbe.zzc().a(zn.J8)).booleanValue()) {
                        List list = ie1Var.f5730y;
                        je1VarB.i();
                        le1.C((le1) je1VarB.f4126t, list);
                    }
                    me1 me1Var = ie1Var.f5726u;
                    ne1 ne1VarB = oe1.B();
                    ne1VarB.i();
                    oe1.C((oe1) ne1VarB.f4126t, (le1) je1VarB.g());
                    me1Var.i();
                    pe1.D((pe1) me1Var.f4126t, (oe1) ne1VarB.g());
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0410  */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.google.android.gms.internal.ads.hq0, com.google.android.gms.internal.ads.sh] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.google.android.gms.internal.ads.hq0, com.google.android.gms.internal.ads.sh] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ViewGroup viewGroup;
        View view;
        int i6;
        View view2;
        ViewGroup viewGroup2;
        wq wqVar;
        Drawable drawable;
        xa0 xa0Var;
        xa0 xa0Var2;
        String strA;
        ik1 gk1Var;
        ik1 ik1Var;
        int i7 = 0;
        z = false;
        boolean z6 = false;
        switch (this.s) {
            case 0:
                y yVar = (y) this.f8187t;
                n90 n90Var = (n90) this.f8188u;
                int i8 = j31.f5914a;
                as0 as0Var = yVar.f10757b.s.D;
                as0Var.c(25, new l2(14, n90Var));
                as0Var.b();
                return;
            case 1:
                y yVar2 = (y) this.f8187t;
                qa2 qa2Var = (qa2) this.f8188u;
                synchronized (qa2Var) {
                }
                int i9 = j31.f5914a;
                bd2 bd2Var = yVar2.f10757b.s.I;
                xc2 xc2VarR = bd2Var.r(bd2Var.f3044d.f2669e);
                bd2Var.q(xc2VarR, 1020, new xj1(xc2VarR, qa2Var));
                return;
            case 2:
                ((qw) this.f8187t).s.loadUrl((String) this.f8188u);
                return;
            case 3:
                int i10 = ja0.O;
                ((p80) this.f8187t).G("onGcacheInfoEvent", (HashMap) this.f8188u);
                return;
            case 4:
                ((ob0) this.f8187t).s.G("pubVideoCmd", (HashMap) this.f8188u);
                return;
            case 5:
                ((fp0) this.f8187t).o((sh) this.f8188u);
                return;
            case 6:
                up0 up0Var = (up0) this.f8187t;
                ?? r6 = (sh) this.f8188u;
                jp0 jp0Var = up0Var.f9598d;
                mp0 mp0Var = up0Var.f9597c;
                if (mp0Var.e() || mp0Var.d()) {
                    String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
                    for (int i11 = 0; i11 < 2; i11++) {
                        View viewZzg = r6.zzg(strArr[i11]);
                        if (viewZzg != null && (viewZzg instanceof ViewGroup)) {
                            viewGroup = (ViewGroup) viewZzg;
                        }
                    }
                    viewGroup = null;
                } else {
                    viewGroup = null;
                }
                Context context = r6.zzf().getContext();
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                synchronized (jp0Var) {
                    view = jp0Var.f6126d;
                }
                if (view != null) {
                    oq oqVar = up0Var.f9602i;
                    synchronized (jp0Var) {
                        view2 = jp0Var.f6126d;
                    }
                    if (oqVar != null && viewGroup == null) {
                        up0.b(layoutParams, oqVar.f7841w);
                        view2.setLayoutParams(layoutParams);
                        viewGroup = null;
                    }
                } else if (jp0Var.j() instanceof kq) {
                    kq kqVar = (kq) jp0Var.j();
                    if (viewGroup == null) {
                        up0.b(layoutParams, kqVar.f6471z);
                        viewGroup = null;
                    }
                    lq lqVar = new lq(context);
                    com.google.android.gms.common.internal.l.f(kqVar);
                    ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(lq.f6821t, null, null));
                    shapeDrawable.getPaint().setColor(kqVar.f6467v);
                    lqVar.setLayoutParams(layoutParams);
                    lqVar.setBackground(shapeDrawable);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                    String str = kqVar.s;
                    if (TextUtils.isEmpty(str)) {
                        i6 = 1;
                    } else {
                        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                        TextView textView = new TextView(context);
                        textView.setLayoutParams(layoutParams3);
                        textView.setId(1195835393);
                        textView.setTypeface(Typeface.DEFAULT);
                        textView.setText(str);
                        textView.setTextColor(kqVar.f6468w);
                        textView.setTextSize(kqVar.f6469x);
                        zzbc.zzb();
                        int iZzx = zzf.zzx(context, 4);
                        zzbc.zzb();
                        textView.setPadding(iZzx, 0, zzf.zzx(context, 4), 0);
                        lqVar.addView(textView);
                        int id = textView.getId();
                        i6 = 1;
                        layoutParams2.addRule(1, id);
                    }
                    ImageView imageView = new ImageView(context);
                    imageView.setLayoutParams(layoutParams2);
                    imageView.setId(1195835394);
                    ArrayList arrayList = kqVar.f6465t;
                    if (arrayList != null && arrayList.size() > i6) {
                        lqVar.s = new AnimationDrawable();
                        int size = arrayList.size();
                        int i12 = 0;
                        while (i12 < size) {
                            int i13 = i12 + 1;
                            try {
                                lqVar.s.addFrame((Drawable) k3.b.i1(((mq) arrayList.get(i12)).zzf()), kqVar.f6470y);
                            } catch (Exception e6) {
                                zzo.zzh("Error while getting drawable.", e6);
                            }
                            i12 = i13;
                        }
                        imageView.setBackground(lqVar.s);
                    } else if (arrayList.size() == 1) {
                        try {
                            imageView.setImageDrawable((Drawable) k3.b.i1(((mq) arrayList.get(0)).zzf()));
                        } catch (Exception e7) {
                            zzo.zzh("Error while getting drawable.", e7);
                        }
                    }
                    lqVar.addView(imageView);
                    lqVar.setContentDescription((CharSequence) zzbe.zzc().a(zn.T3));
                    view2 = lqVar;
                } else {
                    view2 = null;
                }
                if (view2 != null) {
                    if (view2.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view2.getParent()).removeView(view2);
                    }
                    if (viewGroup != null) {
                        viewGroup.removeAllViews();
                        viewGroup.addView(view2);
                    } else {
                        zza zzaVar = new zza(r6.zzf().getContext());
                        zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        zzaVar.addView(view2);
                        FrameLayout frameLayoutZzh = r6.zzh();
                        if (frameLayoutZzh != null) {
                            frameLayoutZzh.addView(zzaVar);
                        }
                    }
                    r6.n(r6.zzk(), view2);
                }
                cp1 cp1Var = tp0.G;
                int i14 = cp1Var.f3638v;
                int i15 = 0;
                while (true) {
                    if (i15 < i14) {
                        View viewZzg2 = r6.zzg((String) cp1Var.get(i15));
                        i15++;
                        if (viewZzg2 instanceof ViewGroup) {
                            viewGroup2 = (ViewGroup) viewZzg2;
                        }
                    } else {
                        viewGroup2 = null;
                    }
                }
                up0Var.h.execute(new wx(6, up0Var, viewGroup2));
                if (viewGroup2 == null) {
                    return;
                }
                if (up0Var.c(viewGroup2, true)) {
                    if (jp0Var.m() != null) {
                        jp0Var.m().S(new j00((hq0) r6, viewGroup2));
                        return;
                    }
                    return;
                }
                if (((Boolean) zzbe.zzc().a(zn.S9)).booleanValue() && up0Var.c(viewGroup2, false)) {
                    synchronized (jp0Var) {
                        xa0Var = jp0Var.f6131j;
                    }
                    if (xa0Var != null) {
                        synchronized (jp0Var) {
                            xa0Var2 = jp0Var.f6131j;
                        }
                        xa0Var2.S(new j00((hq0) r6, viewGroup2));
                        return;
                    }
                    return;
                }
                viewGroup2.removeAllViews();
                View viewZzf = r6.zzf();
                Context context2 = viewZzf != null ? viewZzf.getContext() : null;
                if (context2 != null) {
                    hp0 hp0Var = up0Var.f9603j;
                    synchronized (hp0Var) {
                        wqVar = hp0Var.f5451a;
                    }
                    if (wqVar != null) {
                        try {
                            k3.a aVarZzi = wqVar.zzi();
                            if (aVarZzi == null || (drawable = (Drawable) k3.b.i1(aVarZzi)) == null) {
                                return;
                            }
                            ImageView imageView2 = new ImageView(context2);
                            imageView2.setImageDrawable(drawable);
                            k3.a aVarZzj = r6.zzj();
                            if (aVarZzj != null) {
                                if (((Boolean) zzbe.zzc().a(zn.f11356a6)).booleanValue()) {
                                    imageView2.setScaleType((ImageView.ScaleType) k3.b.i1(aVarZzj));
                                } else {
                                    imageView2.setScaleType(up0.f9594k);
                                }
                            }
                            imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            viewGroup2.addView(imageView2);
                            return;
                        } catch (RemoteException unused) {
                            zzo.zzj("Could not get main image drawable");
                            return;
                        }
                    }
                    return;
                }
                return;
            case 7:
                iw0 iw0Var = (iw0) this.f8187t;
                Context context3 = (Context) this.f8188u;
                cu0 cu0Var = iw0Var.f5874t;
                wo woVarZzf = zzv.zzf();
                if (woVarZzf.f10236b.getAndSet(true)) {
                    return;
                }
                woVarZzf.f10237c = context3;
                woVarZzf.f10238d = cu0Var;
                if (woVarZzf.f10240f != null || (strA = p.d.a(context3)) == null) {
                    return;
                }
                woVarZzf.f14051a = context3.getApplicationContext();
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(strA)) {
                    intent.setPackage(strA);
                }
                context3.bindService(intent, woVarZzf, 33);
                return;
            case 8:
                if (((Boolean) zzbe.zzc().a(zn.f11371c5)).booleanValue() && bq.D.f3169a) {
                    ((fg1) this.f8187t).a((View) this.f8188u, hg1.s);
                    return;
                }
                return;
            case 9:
                t31 t31Var = (t31) this.f8187t;
                xj1 xj1Var = (xj1) this.f8188u;
                Iterator it = ((HashMap) t31Var.f9097v).values().iterator();
                while (it.hasNext()) {
                    ((cg1) it.next()).b();
                }
                Timer timer = new Timer();
                timer.schedule(new jg1(t31Var, xj1Var, timer), 1000L);
                return;
            case 10:
                ((eb1) this.f8187t).f4201w.f4593e.k0((zze) this.f8188u);
                return;
            case 11:
                a();
                return;
            case 12:
                IBinder iBinder = (IBinder) this.f8188u;
                int i16 = hk1.s;
                if (iBinder == null) {
                    gk1Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
                    gk1Var = iInterfaceQueryLocalInterface instanceof ik1 ? (ik1) iInterfaceQueryLocalInterface : new gk1(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
                }
                gl1 gl1Var = (gl1) this.f8187t;
                hl1 hl1Var = gl1Var.f5088a;
                hl1Var.f5445j = gk1Var;
                hl1Var.f5439c.c("linkToDeath", new Object[0]);
                try {
                    ik1Var = gl1Var.f5088a.f5445j;
                } catch (RemoteException e8) {
                    gl1Var.f5088a.f5439c.b(e8, "linkToDeath failed", new Object[0]);
                }
                if (ik1Var == null) {
                    throw null;
                }
                ik1Var.asBinder().linkToDeath(gl1Var.f5088a.h, 0);
                hl1 hl1Var2 = gl1Var.f5088a;
                hl1Var2.f5442f = false;
                synchronized (hl1Var2.f5441e) {
                    try {
                        ArrayList arrayList2 = gl1Var.f5088a.f5441e;
                        int size2 = arrayList2.size();
                        while (i7 < size2) {
                            Object obj = arrayList2.get(i7);
                            i7++;
                            ((Runnable) obj).run();
                        }
                        gl1Var.f5088a.f5441e.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 13:
                ((jm0) this.f8187t).mo6zza(this.f8188u);
                return;
            default:
                ei2 ei2Var = (ei2) this.f8187t;
                m1 m1Var = (m1) this.f8188u;
                ei2Var.P = ei2Var.H == null ? m1Var : new l1(-9223372036854775807L, 0L);
                ei2Var.Q = m1Var.zza();
                if (!ei2Var.X && m1Var.zza() == -9223372036854775807L) {
                    z6 = true;
                }
                ei2Var.R = z6;
                ei2Var.S = true == z6 ? 7 : 1;
                if (ei2Var.L) {
                    ei2Var.f4315x.r(m1Var.zzh(), ei2Var.Q, ei2Var.R);
                    return;
                } else {
                    ei2Var.q();
                    return;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ q(fp0 fp0Var, hq0 hq0Var) {
        this.s = 5;
        this.f8187t = fp0Var;
        this.f8188u = (sh) hq0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ q(up0 up0Var, hq0 hq0Var) {
        this.s = 6;
        this.f8187t = up0Var;
        this.f8188u = (sh) hq0Var;
    }
}
