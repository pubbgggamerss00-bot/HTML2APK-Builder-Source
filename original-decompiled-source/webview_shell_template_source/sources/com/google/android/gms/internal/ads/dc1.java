package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.client.zzy;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class dc1 {

    /* renamed from: a, reason: collision with root package name */
    public zzm f3829a;

    /* renamed from: b, reason: collision with root package name */
    public zzs f3830b;

    /* renamed from: c, reason: collision with root package name */
    public String f3831c;

    /* renamed from: d, reason: collision with root package name */
    public zzga f3832d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3833e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f3834f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f3835g;
    public oq h;

    /* renamed from: i, reason: collision with root package name */
    public zzy f3836i;

    /* renamed from: j, reason: collision with root package name */
    public AdManagerAdViewOptions f3837j;

    /* renamed from: k, reason: collision with root package name */
    public PublisherAdViewOptions f3838k;

    /* renamed from: l, reason: collision with root package name */
    public zzcm f3839l;

    /* renamed from: m, reason: collision with root package name */
    public int f3840m = 1;

    /* renamed from: n, reason: collision with root package name */
    public bw f3841n;

    /* renamed from: o, reason: collision with root package name */
    public final yb1 f3842o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3843p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3844q;

    /* renamed from: r, reason: collision with root package name */
    public j41 f3845r;
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public Bundle f3846t;

    /* renamed from: u, reason: collision with root package name */
    public zzcq f3847u;

    public dc1() {
        yb1 yb1Var = new yb1();
        yb1Var.f10916a = 2;
        this.f3842o = yb1Var;
        this.f3843p = false;
        this.f3844q = false;
        this.s = false;
    }

    public final ec1 a() {
        com.google.android.gms.common.internal.l.g("ad unit must not be null", this.f3831c);
        com.google.android.gms.common.internal.l.g("ad size must not be null", this.f3830b);
        com.google.android.gms.common.internal.l.g("ad request must not be null", this.f3829a);
        return new ec1(this);
    }
}
