package o3;

import android.app.Notification;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.core.graphics.drawable.IconCompat;
import com.basitce.htmltoapk.R;
import java.util.ArrayList;
import o3.s;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Notification.Builder f18954a;

    /* renamed from: b, reason: collision with root package name */
    public final j f18955b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f18956c = new Bundle();

    public static class a {
        public static void a(Notification.Builder builder, boolean z10) {
            builder.setAllowSystemGeneratedContextualActions(z10);
        }

        public static void b(Notification.Builder builder) {
            builder.setBubbleMetadata(null);
        }

        public static void c(Notification.Action.Builder builder) {
            builder.setContextual(false);
        }
    }

    public static class b {
        public static void a(Notification.Action.Builder builder) {
            builder.setAuthenticationRequired(false);
        }
    }

    public static final class c {
        public static void a(Notification.Builder builder) {
            builder.setShortCriticalText(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r15v5, types: [android.os.Bundle[]] */
    /* JADX WARN: Type inference failed for: r15v6, types: [android.os.Parcelable[]] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r2v24, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v25, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r6v31, types: [android.os.Bundle] */
    public m(j jVar) {
        ?? r15;
        int i10;
        this.f18955b = jVar;
        Context context = jVar.f18937a;
        ArrayList<h> arrayList = jVar.f18940d;
        Notification.Builder builder = new Notification.Builder(context, jVar.f18949m);
        this.f18954a = builder;
        Notification notification = jVar.f18951o;
        Resources resources = null;
        int i11 = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(jVar.f18941e).setContentText(jVar.f18942f).setContentInfo(null).setContentIntent(jVar.f18943g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        builder.setLargeIcon((Icon) null);
        builder.setSubText(null).setUsesChronometer(false).setPriority(jVar.f18944h);
        l lVar = jVar.f18946j;
        if (lVar instanceof k) {
            k kVar = (k) lVar;
            int color = p3.b.getColor(kVar.f18953a.f18937a, R.color.call_notification_decline_color);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) kVar.f18953a.f18937a.getResources().getString(R.string.call_notification_hang_up_action));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(color), 0, spannableStringBuilder.length(), 18);
            Context context2 = kVar.f18953a.f18937a;
            PorterDuff.Mode mode = IconCompat.f1400k;
            context2.getClass();
            IconCompat iconCompatA = IconCompat.a(context2.getResources(), context2.getPackageName(), R.drawable.ic_call_decline);
            Bundle bundle = new Bundle();
            CharSequence charSequenceA = j.a(spannableStringBuilder);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            if (!arrayList2.isEmpty()) {
            }
            h hVar = new h(iconCompatA, charSequenceA, null, bundle, arrayList3.isEmpty() ? null : (s[]) arrayList3.toArray(new s[arrayList3.size()]));
            hVar.f18928a.putBoolean("key_action_priority", true);
            ArrayList arrayList4 = new ArrayList(3);
            arrayList4.add(hVar);
            ArrayList<h> arrayList5 = kVar.f18953a.f18938b;
            if (arrayList5 != null) {
                int size = arrayList5.size();
                int i12 = 0;
                while (i12 < size) {
                    h hVar2 = arrayList5.get(i12);
                    i12++;
                    h hVar3 = hVar2;
                    hVar3.getClass();
                    if (!hVar3.f18928a.getBoolean("key_action_priority")) {
                        arrayList4.add(hVar3);
                    }
                }
            }
            int size2 = arrayList4.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj = arrayList4.get(i13);
                i13++;
                a((h) obj);
            }
        } else {
            ArrayList<h> arrayList6 = jVar.f18938b;
            int size3 = arrayList6.size();
            int i14 = 0;
            while (i14 < size3) {
                h hVar4 = arrayList6.get(i14);
                i14++;
                a(hVar4);
            }
        }
        Bundle bundle2 = jVar.f18948l;
        if (bundle2 != null) {
            this.f18956c.putAll(bundle2);
        }
        this.f18954a.setShowWhen(jVar.f18945i);
        this.f18954a.setLocalOnly(jVar.f18947k);
        this.f18954a.setGroup(null);
        this.f18954a.setSortKey(null);
        this.f18954a.setGroupSummary(false);
        this.f18954a.setCategory(null);
        this.f18954a.setColor(0);
        this.f18954a.setVisibility(0);
        this.f18954a.setPublicVersion(null);
        this.f18954a.setSound(notification.sound, notification.audioAttributes);
        ArrayList<String> arrayList7 = jVar.f18952p;
        if (arrayList7 != null && !arrayList7.isEmpty()) {
            int size4 = arrayList7.size();
            int i15 = 0;
            while (i15 < size4) {
                String str = arrayList7.get(i15);
                i15++;
                this.f18954a.addPerson(str);
            }
        }
        if (arrayList.size() > 0) {
            if (jVar.f18948l == null) {
                jVar.f18948l = new Bundle();
            }
            Bundle bundle3 = jVar.f18948l.getBundle("android.car.EXTENSIONS");
            ?? bundle4 = bundle3 == null ? new Bundle() : bundle3;
            ?? bundle5 = new Bundle((Bundle) bundle4);
            ?? bundle6 = new Bundle();
            int i16 = 0;
            while (i16 < arrayList.size()) {
                String string = Integer.toString(i16);
                h hVar5 = arrayList.get(i16);
                ?? bundle7 = new Bundle();
                if (hVar5.f18929b == null && (i10 = hVar5.f18933f) != 0) {
                    hVar5.f18929b = IconCompat.a(resources, "", i10);
                }
                IconCompat iconCompat = hVar5.f18929b;
                Bundle bundle8 = hVar5.f18928a;
                bundle7.putInt("icon", iconCompat != null ? iconCompat.b() : i11);
                bundle7.putCharSequence("title", hVar5.f18934g);
                bundle7.putParcelable("actionIntent", hVar5.f18935h);
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", hVar5.f18931d);
                bundle7.putBundle("extras", bundle9);
                s[] sVarArr = hVar5.f18930c;
                if (sVarArr == null) {
                    r15 = resources;
                } else {
                    r15 = new Bundle[sVarArr.length];
                    while (i11 < sVarArr.length) {
                        s sVar = sVarArr[i11];
                        ArrayList<h> arrayList8 = arrayList;
                        Bundle bundle10 = new Bundle();
                        sVar.getClass();
                        bundle10.putString("resultKey", null);
                        bundle10.putCharSequence(AnnotatedPrivateKey.LABEL, null);
                        bundle10.putCharSequenceArray("choices", null);
                        int i17 = i11;
                        bundle10.putBoolean("allowFreeFormInput", false);
                        bundle10.putBundle("extras", null);
                        r15[i17] = bundle10;
                        i11 = i17 + 1;
                        arrayList = arrayList8;
                        i16 = i16;
                    }
                }
                ArrayList<h> arrayList9 = arrayList;
                int i18 = i16;
                bundle7.putParcelableArray("remoteInputs", r15);
                bundle7.putBoolean("showsUserInterface", hVar5.f18932e);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(string, bundle7);
                i16 = i18 + 1;
                arrayList = arrayList9;
                resources = null;
                i11 = 0;
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (jVar.f18948l == null) {
                jVar.f18948l = new Bundle();
            }
            jVar.f18948l.putBundle("android.car.EXTENSIONS", bundle4);
            this.f18956c.putBundle("android.car.EXTENSIONS", bundle5);
        }
        this.f18954a.setExtras(jVar.f18948l);
        this.f18954a.setRemoteInputHistory(null);
        this.f18954a.setBadgeIconType(0);
        this.f18954a.setSettingsText(null);
        this.f18954a.setShortcutId(null);
        this.f18954a.setTimeoutAfter(0L);
        this.f18954a.setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(jVar.f18949m)) {
            this.f18954a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        ArrayList<q> arrayList10 = jVar.f18939c;
        int size5 = arrayList10.size();
        int i19 = 0;
        while (i19 < size5) {
            q qVar = arrayList10.get(i19);
            i19++;
            Notification.Builder builder2 = this.f18954a;
            qVar.getClass();
            builder2.addPerson(new Person.Builder().setName(null).setIcon(null).setUri(null).setKey(null).setBot(false).setImportant(false).build());
        }
        int i20 = Build.VERSION.SDK_INT;
        if (i20 >= 29) {
            a.a(this.f18954a, jVar.f18950n);
            a.b(this.f18954a);
        }
        if (i20 >= 36) {
            c.a(this.f18954a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(h hVar) {
        Icon iconCreateWithBitmap;
        String resPackage;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        int i10;
        if (hVar.f18929b == null && (i10 = hVar.f18933f) != 0) {
            hVar.f18929b = IconCompat.a(null, "", i10);
        }
        IconCompat iconCompat = hVar.f18929b;
        boolean z10 = hVar.f18931d;
        Bundle bundle = hVar.f18928a;
        if (iconCompat != null) {
            int i11 = iconCompat.f1401a;
            switch (i11) {
                case -1:
                    iconCreateWithBitmap = (Icon) iconCompat.f1402b;
                    break;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f1402b);
                    colorStateList = iconCompat.f1407g;
                    if (colorStateList != null) {
                        iconCreateWithBitmap.setTintList(colorStateList);
                    }
                    mode = iconCompat.f1408h;
                    if (mode != IconCompat.f1400k) {
                        iconCreateWithBitmap.setTintMode(mode);
                        break;
                    }
                    break;
                case 2:
                    if (i11 == -1) {
                        resPackage = ((Icon) iconCompat.f1402b).getResPackage();
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("called getResPackage() on " + iconCompat);
                        }
                        String str = iconCompat.f1410j;
                        resPackage = (str == null || TextUtils.isEmpty(str)) ? ((String) iconCompat.f1402b).split(":", -1)[0] : iconCompat.f1410j;
                    }
                    iconCreateWithBitmap = Icon.createWithResource(resPackage, iconCompat.f1405e);
                    colorStateList = iconCompat.f1407g;
                    if (colorStateList != null) {
                    }
                    mode = iconCompat.f1408h;
                    if (mode != IconCompat.f1400k) {
                    }
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f1402b, iconCompat.f1405e, iconCompat.f1406f);
                    colorStateList = iconCompat.f1407g;
                    if (colorStateList != null) {
                    }
                    mode = iconCompat.f1408h;
                    if (mode != IconCompat.f1400k) {
                    }
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f1402b);
                    colorStateList = iconCompat.f1407g;
                    if (colorStateList != null) {
                    }
                    mode = iconCompat.f1408h;
                    if (mode != IconCompat.f1400k) {
                    }
                    break;
                case 5:
                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) iconCompat.f1402b);
                    colorStateList = iconCompat.f1407g;
                    if (colorStateList != null) {
                    }
                    mode = iconCompat.f1408h;
                    if (mode != IconCompat.f1400k) {
                    }
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT < 30) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.c());
                    }
                    iconCreateWithBitmap = IconCompat.a.a(iconCompat.c());
                    colorStateList = iconCompat.f1407g;
                    if (colorStateList != null) {
                    }
                    mode = iconCompat.f1408h;
                    if (mode != IconCompat.f1400k) {
                    }
                    break;
            }
        } else {
            iconCreateWithBitmap = null;
        }
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCreateWithBitmap, hVar.f18934g, hVar.f18935h);
        s[] sVarArr = hVar.f18930c;
        if (sVarArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[sVarArr.length];
            for (int i12 = 0; i12 < sVarArr.length; i12++) {
                sVarArr[i12].getClass();
                RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(null).setLabel(null).setChoices(null).setAllowFreeFormInput(false).addExtras(null);
                if (Build.VERSION.SDK_INT >= 29) {
                    s.a.a(builderAddExtras);
                }
                remoteInputArr[i12] = builderAddExtras.build();
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", z10);
        int i13 = Build.VERSION.SDK_INT;
        builder.setAllowGeneratedReplies(z10);
        bundle2.putInt("android.support.action.semanticAction", 0);
        builder.setSemanticAction(0);
        if (i13 >= 29) {
            a.c(builder);
        }
        if (i13 >= 31) {
            b.a(builder);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", hVar.f18932e);
        builder.addExtras(bundle2);
        this.f18954a.addAction(builder.build());
    }
}
