package j2;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class j1 implements d5 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14771a;

    public j1(Context context) {
        this.f14771a = context;
    }

    @Override // j2.d5
    public final void a(String str) {
        try {
            this.f14771a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e10) {
            throw new IllegalArgumentException("Can't open " + str + '.', e10);
        }
    }
}
