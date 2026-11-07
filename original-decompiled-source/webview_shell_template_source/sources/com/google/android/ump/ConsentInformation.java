package com.google.android.ump;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface ConsentInformation {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface a {
        void a(@RecentlyNonNull b5.c cVar);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface b {
        void c();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class c {

        @RecentlyNonNull
        public static final c s;

        /* renamed from: t, reason: collision with root package name */
        @RecentlyNonNull
        public static final c f12520t;

        /* renamed from: u, reason: collision with root package name */
        @RecentlyNonNull
        public static final c f12521u;

        /* renamed from: v, reason: collision with root package name */
        public static final /* synthetic */ c[] f12522v;

        static {
            c cVar = new c("UNKNOWN", 0);
            s = cVar;
            c cVar2 = new c("NOT_REQUIRED", 1);
            f12520t = cVar2;
            c cVar3 = new c("REQUIRED", 2);
            f12521u = cVar3;
            f12522v = new c[]{cVar, cVar2, cVar3};
        }

        @RecentlyNonNull
        public static c valueOf(@RecentlyNonNull String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        @RecentlyNonNull
        public static c[] values() {
            return (c[]) f12522v.clone();
        }
    }

    boolean canRequestAds();

    int getConsentStatus();

    @RecentlyNonNull
    c getPrivacyOptionsRequirementStatus();

    boolean isConsentFormAvailable();

    void requestConsentInfoUpdate(@RecentlyNonNull Activity activity, @RecentlyNonNull b5.b bVar, @RecentlyNonNull b bVar2, @RecentlyNonNull a aVar);

    void reset();
}
