package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class pg1 implements sg1 {

    /* renamed from: e, reason: collision with root package name */
    public static final pg1 f8065e = new pg1(new tg1());

    /* renamed from: a, reason: collision with root package name */
    public Date f8066a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8067b;

    /* renamed from: c, reason: collision with root package name */
    public final tg1 f8068c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8069d;

    public pg1(tg1 tg1Var) {
        this.f8068c = tg1Var;
    }

    @Override // com.google.android.gms.internal.ads.sg1
    public final void a(boolean z6) throws JSONException {
        if (!this.f8069d && z6) {
            Date date = new Date();
            Date date2 = this.f8066a;
            if (date2 == null || date.after(date2)) {
                this.f8066a = date;
                if (this.f8067b) {
                    Iterator it = Collections.unmodifiableCollection(rg1.f8631c.f8633b).iterator();
                    while (it.hasNext()) {
                        ch1 ch1Var = ((fg1) it.next()).f4654d;
                        Date date3 = this.f8066a;
                        ch1Var.c(date3 != null ? (Date) date3.clone() : null);
                    }
                }
            }
        }
        this.f8069d = z6;
    }
}
