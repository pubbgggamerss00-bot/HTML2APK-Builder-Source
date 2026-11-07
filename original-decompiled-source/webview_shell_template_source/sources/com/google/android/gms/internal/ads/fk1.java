package com.google.android.gms.internal.ads;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fk1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ClipData f4716a = ClipData.newIntent(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new Intent());

    public static Intent a(Intent intent, int i6) {
        boolean zB = b(0, 17);
        boolean zB2 = b(0, 9);
        boolean zB3 = b(0, 5);
        boolean zB4 = b(0, 3);
        sl1.e("Must set component on Intent.", intent.getComponent() != null);
        if (b(0, 1)) {
            sl1.e("Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.", !b(i6, 67108864));
        } else {
            sl1.e("Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.", b(i6, 67108864));
        }
        Intent intent2 = new Intent(intent);
        if (!b(i6, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!zB4 && intent2.getAction() == null) {
                intent2.setAction(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            }
            if (!zB2 && intent2.getCategories() == null) {
                intent2.addCategory(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            }
            if (!zB3 && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!zB && intent2.getClipData() == null) {
                intent2.setClipData(f4716a);
            }
        }
        return intent2;
    }

    public static boolean b(int i6, int i7) {
        return (i6 & i7) == i7;
    }
}
