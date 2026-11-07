package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.basitce.htmltoapk.R;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f6192a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6193b;

    public s(Context context) {
        p.f(context);
        Resources resources = context.getResources();
        this.f6192a = resources;
        this.f6193b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public final String a(String str) {
        Resources resources = this.f6192a;
        int identifier = resources.getIdentifier(str, "string", this.f6193b);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
