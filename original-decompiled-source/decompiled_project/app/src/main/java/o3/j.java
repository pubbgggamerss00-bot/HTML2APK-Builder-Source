package o3;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public Context f18937a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList<h> f18938b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList<q> f18939c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<h> f18940d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f18941e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f18942f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f18943g;

    /* renamed from: h, reason: collision with root package name */
    public int f18944h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18945i;

    /* renamed from: j, reason: collision with root package name */
    public l f18946j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f18947k;

    /* renamed from: l, reason: collision with root package name */
    public Bundle f18948l;

    /* renamed from: m, reason: collision with root package name */
    public String f18949m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18950n;

    /* renamed from: o, reason: collision with root package name */
    public Notification f18951o;

    /* renamed from: p, reason: collision with root package name */
    @Deprecated
    public ArrayList<String> f18952p;

    public static CharSequence a(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void b(l lVar) {
        if (this.f18946j != lVar) {
            this.f18946j = lVar;
            if (lVar == null || lVar.f18953a == this) {
                return;
            }
            lVar.f18953a = this;
            b(lVar);
        }
    }
}
