package i0;

import android.app.Notification;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.htmltoapk.template.R;
import i0.t;
import i0.v;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13334a;

    /* renamed from: b, reason: collision with root package name */
    public final Notification.Builder f13335b;

    /* renamed from: c, reason: collision with root package name */
    public final m f13336c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f13337d;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static void b(Notification.Builder builder) {
            builder.setBadgeIconType(0);
        }

        public static void c(Notification.Builder builder) {
            builder.setGroupAlertBehavior(0);
        }

        public static void d(Notification.Builder builder) {
            builder.setSettingsText(null);
        }

        public static void e(Notification.Builder builder) {
            builder.setShortcutId(null);
        }

        public static void f(Notification.Builder builder) {
            builder.setTimeoutAfter(0L);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {
        public static void a(Notification.Builder builder, Person person) {
            builder.addPerson(person);
        }

        public static void b(Notification.Action.Builder builder) {
            builder.setSemanticAction(0);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c {
        public static void a(Notification.Builder builder, boolean z6) {
            builder.setAllowSystemGeneratedContextualActions(z6);
        }

        public static void b(Notification.Builder builder) {
            builder.setBubbleMetadata(null);
        }

        public static void c(Notification.Action.Builder builder) {
            builder.setContextual(false);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d {
        public static void a(Notification.Action.Builder builder) {
            builder.setAuthenticationRequired(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x03e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(m mVar) {
        int i6;
        Bundle[] bundleArr;
        ArrayList<j> arrayList;
        String str;
        int i7;
        ArrayList<String> arrayList2;
        new ArrayList();
        this.f13337d = new Bundle();
        this.f13336c = mVar;
        Context context = mVar.f13317a;
        ArrayList<String> arrayList3 = mVar.f13332q;
        ArrayList<t> arrayList4 = mVar.f13319c;
        ArrayList<j> arrayList5 = mVar.f13320d;
        this.f13334a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f13335b = a.a(context, mVar.f13329n);
        } else {
            this.f13335b = new Notification.Builder(context);
        }
        Notification notification = mVar.f13331p;
        Resources resources = null;
        int i8 = 2;
        this.f13335b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(mVar.f13321e).setContentText(mVar.f13322f).setContentInfo(null).setContentIntent(mVar.f13323g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        Notification.Builder builder = this.f13335b;
        IconCompat iconCompat = mVar.h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.f(context));
        this.f13335b.setSubText(null).setUsesChronometer(false).setPriority(mVar.f13324i);
        o oVar = mVar.f13326k;
        if (oVar instanceof n) {
            n nVar = (n) oVar;
            int color = nVar.f13333a.f13317a.getColor(R.color.call_notification_decline_color);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) nVar.f13333a.f13317a.getResources().getString(R.string.call_notification_hang_up_action));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(color), 0, spannableStringBuilder.length(), 18);
            Context context2 = nVar.f13333a.f13317a;
            PorterDuff.Mode mode = IconCompat.f965k;
            context2.getClass();
            IconCompat iconCompatB = IconCompat.b(context2.getResources(), context2.getPackageName(), R.drawable.ic_call_decline);
            Bundle bundle = new Bundle();
            CharSequence charSequenceB = m.b(spannableStringBuilder);
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            j jVar = new j(iconCompatB, charSequenceB, null, bundle, arrayList7.isEmpty() ? null : (v[]) arrayList7.toArray(new v[arrayList7.size()]), arrayList6.isEmpty() ? null : (v[]) arrayList6.toArray(new v[arrayList6.size()]));
            jVar.f13306a.putBoolean("key_action_priority", true);
            ArrayList arrayList8 = new ArrayList(3);
            arrayList8.add(jVar);
            ArrayList<j> arrayList9 = nVar.f13333a.f13318b;
            if (arrayList9 != null) {
                int size = arrayList9.size();
                int i9 = 0;
                while (i9 < size) {
                    j jVar2 = arrayList9.get(i9);
                    i9++;
                    j jVar3 = jVar2;
                    jVar3.getClass();
                    if (!jVar3.f13306a.getBoolean("key_action_priority") && i8 > 1) {
                        arrayList8.add(jVar3);
                        i8--;
                    }
                }
            }
            int size2 = arrayList8.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj = arrayList8.get(i10);
                i10++;
                a((j) obj);
            }
        } else {
            ArrayList<j> arrayList10 = mVar.f13318b;
            int size3 = arrayList10.size();
            int i11 = 0;
            while (i11 < size3) {
                j jVar4 = arrayList10.get(i11);
                i11++;
                a(jVar4);
            }
        }
        Bundle bundle2 = mVar.f13328m;
        if (bundle2 != null) {
            this.f13337d.putAll(bundle2);
        }
        int i12 = Build.VERSION.SDK_INT;
        this.f13335b.setShowWhen(mVar.f13325j);
        this.f13335b.setLocalOnly(mVar.f13327l);
        this.f13335b.setGroup(null);
        this.f13335b.setSortKey(null);
        this.f13335b.setGroupSummary(false);
        this.f13335b.setCategory(null);
        this.f13335b.setColor(0);
        this.f13335b.setVisibility(0);
        this.f13335b.setPublicVersion(null);
        this.f13335b.setSound(notification.sound, notification.audioAttributes);
        String str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (i12 < 28) {
            if (arrayList4 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList<>(arrayList4.size());
                int size4 = arrayList4.size();
                int i13 = 0;
                while (i13 < size4) {
                    t tVar = arrayList4.get(i13);
                    i13++;
                    tVar.getClass();
                    arrayList2.add(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                }
            }
            if (arrayList2 != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList2;
                } else {
                    w.b bVar = new w.b(arrayList3.size() + arrayList2.size());
                    bVar.addAll(arrayList2);
                    bVar.addAll(arrayList3);
                    arrayList3 = new ArrayList<>(bVar);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size5 = arrayList3.size();
            int i14 = 0;
            while (i14 < size5) {
                String str3 = arrayList3.get(i14);
                i14++;
                this.f13335b.addPerson(str3);
            }
        }
        if (arrayList5.size() > 0) {
            if (mVar.f13328m == null) {
                mVar.f13328m = new Bundle();
            }
            Bundle bundle3 = mVar.f13328m.getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            int i15 = 0;
            while (i15 < arrayList5.size()) {
                String string = Integer.toString(i15);
                j jVar5 = arrayList5.get(i15);
                Bundle bundle6 = new Bundle();
                if (jVar5.f13307b == null && (i7 = jVar5.f13311f) != 0) {
                    jVar5.f13307b = IconCompat.b(resources, str2, i7);
                }
                IconCompat iconCompat2 = jVar5.f13307b;
                Bundle bundle7 = jVar5.f13306a;
                bundle6.putInt("icon", iconCompat2 != null ? iconCompat2.c() : 0);
                bundle6.putCharSequence("title", jVar5.f13312g);
                bundle6.putParcelable("actionIntent", jVar5.h);
                Bundle bundle8 = bundle7 != null ? new Bundle(bundle7) : new Bundle();
                bundle8.putBoolean("android.support.allowGeneratedReplies", jVar5.f13309d);
                bundle6.putBundle("extras", bundle8);
                v[] vVarArr = jVar5.f13308c;
                if (vVarArr == null) {
                    arrayList = arrayList5;
                    str = str2;
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[vVarArr.length];
                    arrayList = arrayList5;
                    str = str2;
                    int i16 = 0;
                    while (i16 < vVarArr.length) {
                        v vVar = vVarArr[i16];
                        int i17 = i16;
                        Bundle bundle9 = new Bundle();
                        vVar.getClass();
                        bundle9.putString("resultKey", null);
                        bundle9.putCharSequence("label", null);
                        bundle9.putCharSequenceArray("choices", null);
                        bundle9.putBoolean("allowFreeFormInput", false);
                        bundle9.putBundle("extras", null);
                        bundleArr[i17] = bundle9;
                        i16 = i17 + 1;
                        vVarArr = vVarArr;
                        i15 = i15;
                    }
                }
                int i18 = i15;
                bundle6.putParcelableArray("remoteInputs", bundleArr);
                bundle6.putBoolean("showsUserInterface", jVar5.f13310e);
                bundle6.putInt("semanticAction", 0);
                bundle5.putBundle(string, bundle6);
                i15 = i18 + 1;
                arrayList5 = arrayList;
                str2 = str;
                resources = null;
            }
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (mVar.f13328m == null) {
                mVar.f13328m = new Bundle();
            }
            mVar.f13328m.putBundle("android.car.EXTENSIONS", bundle3);
            this.f13337d.putBundle("android.car.EXTENSIONS", bundle4);
        }
        int i19 = Build.VERSION.SDK_INT;
        this.f13335b.setExtras(mVar.f13328m);
        this.f13335b.setRemoteInputHistory(null);
        if (i19 >= 26) {
            a.b(this.f13335b);
            a.d(this.f13335b);
            a.e(this.f13335b);
            a.f(this.f13335b);
            a.c(this.f13335b);
            if (TextUtils.isEmpty(mVar.f13329n)) {
                i6 = 0;
            } else {
                i6 = 0;
                this.f13335b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i19 >= 28) {
            int size6 = arrayList4.size();
            int i20 = i6;
            while (i20 < size6) {
                t tVar2 = arrayList4.get(i20);
                i20++;
                t tVar3 = tVar2;
                Notification.Builder builder2 = this.f13335b;
                tVar3.getClass();
                b.a(builder2, t.a.a(tVar3));
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            c.a(this.f13335b, mVar.f13330o);
            c.b(this.f13335b);
        }
    }

    public final void a(j jVar) {
        int i6;
        if (jVar.f13307b == null && (i6 = jVar.f13311f) != 0) {
            jVar.f13307b = IconCompat.b(null, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, i6);
        }
        IconCompat iconCompat = jVar.f13307b;
        boolean z6 = jVar.f13309d;
        Bundle bundle = jVar.f13306a;
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompat != null ? iconCompat.f(null) : null, jVar.f13312g, jVar.h);
        v[] vVarArr = jVar.f13308c;
        if (vVarArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[vVarArr.length];
            for (int i7 = 0; i7 < vVarArr.length; i7++) {
                vVarArr[i7].getClass();
                RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(null).setLabel(null).setChoices(null).setAllowFreeFormInput(false).addExtras(null);
                if (Build.VERSION.SDK_INT >= 29) {
                    v.a.a(builderAddExtras);
                }
                remoteInputArr[i7] = builderAddExtras.build();
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", z6);
        int i8 = Build.VERSION.SDK_INT;
        builder.setAllowGeneratedReplies(z6);
        bundle2.putInt("android.support.action.semanticAction", 0);
        if (i8 >= 28) {
            b.b(builder);
        }
        if (i8 >= 29) {
            c.c(builder);
        }
        if (i8 >= 31) {
            d.a(builder);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", jVar.f13310e);
        builder.addExtras(bundle2);
        this.f13335b.addAction(builder.build());
    }
}
