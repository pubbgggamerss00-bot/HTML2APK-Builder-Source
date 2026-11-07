package k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import e.e;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import l.f;
import l.g;
import m.u;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class a extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class<?>[] f15759e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class<?>[] f15760f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f15761a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f15762b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f15763c;

    /* renamed from: d, reason: collision with root package name */
    public Object f15764d;

    /* renamed from: k.a$a, reason: collision with other inner class name */
    public static class MenuItemOnMenuItemClickListenerC0153a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        public static final Class<?>[] f15765c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        public Object f15766a;

        /* renamed from: b, reason: collision with root package name */
        public Method f15767b;

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Object obj = this.f15766a;
            Method method = this.f15767b;
            try {
                if (method.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public class b {
        public CharSequence A;
        public CharSequence B;

        /* renamed from: a, reason: collision with root package name */
        public final Menu f15768a;

        /* renamed from: h, reason: collision with root package name */
        public boolean f15775h;

        /* renamed from: i, reason: collision with root package name */
        public int f15776i;

        /* renamed from: j, reason: collision with root package name */
        public int f15777j;

        /* renamed from: k, reason: collision with root package name */
        public CharSequence f15778k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f15779l;

        /* renamed from: m, reason: collision with root package name */
        public int f15780m;

        /* renamed from: n, reason: collision with root package name */
        public char f15781n;

        /* renamed from: o, reason: collision with root package name */
        public int f15782o;

        /* renamed from: p, reason: collision with root package name */
        public char f15783p;

        /* renamed from: q, reason: collision with root package name */
        public int f15784q;

        /* renamed from: r, reason: collision with root package name */
        public int f15785r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f15786s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f15787t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f15788u;

        /* renamed from: v, reason: collision with root package name */
        public int f15789v;

        /* renamed from: w, reason: collision with root package name */
        public int f15790w;

        /* renamed from: x, reason: collision with root package name */
        public String f15791x;

        /* renamed from: y, reason: collision with root package name */
        public String f15792y;

        /* renamed from: z, reason: collision with root package name */
        public y3.b f15793z;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;

        /* renamed from: b, reason: collision with root package name */
        public int f15769b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f15770c = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f15771d = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f15772e = 0;

        /* renamed from: f, reason: collision with root package name */
        public boolean f15773f = true;

        /* renamed from: g, reason: collision with root package name */
        public boolean f15774g = true;

        public b(Menu menu) {
            this.f15768a = menu;
        }

        public final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
            try {
                Constructor<?> constructor = Class.forName(str, false, a.this.f15763c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        public final void b(MenuItem menuItem) {
            a aVar = a.this;
            Context context = aVar.f15763c;
            boolean z10 = false;
            menuItem.setChecked(this.f15786s).setVisible(this.f15787t).setEnabled(this.f15788u).setCheckable(this.f15785r >= 1).setTitleCondensed(this.f15779l).setIcon(this.f15780m);
            int i10 = this.f15789v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f15792y != null) {
                if (context.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                if (aVar.f15764d == null) {
                    aVar.f15764d = a.a(context);
                }
                Object obj = aVar.f15764d;
                String str = this.f15792y;
                MenuItemOnMenuItemClickListenerC0153a menuItemOnMenuItemClickListenerC0153a = new MenuItemOnMenuItemClickListenerC0153a();
                menuItemOnMenuItemClickListenerC0153a.f15766a = obj;
                Class<?> cls = obj.getClass();
                try {
                    menuItemOnMenuItemClickListenerC0153a.f15767b = cls.getMethod(str, MenuItemOnMenuItemClickListenerC0153a.f15765c);
                    menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC0153a);
                } catch (Exception e10) {
                    StringBuilder sbA = e.a("Couldn't resolve menu item onClick handler ", str, " in class ");
                    sbA.append(cls.getName());
                    InflateException inflateException = new InflateException(sbA.toString());
                    inflateException.initCause(e10);
                    throw inflateException;
                }
            }
            if (this.f15785r >= 2) {
                if (menuItem instanceof f) {
                    f fVar = (f) menuItem;
                    fVar.A = (fVar.A & (-5)) | 4;
                } else if (menuItem instanceof g) {
                    try {
                        throw null;
                    } catch (Exception e11) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e11);
                    }
                }
            }
            String str2 = this.f15791x;
            if (str2 != null) {
                menuItem.setActionView((View) a(str2, a.f15759e, aVar.f15761a));
                z10 = true;
            }
            int i11 = this.f15790w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            y3.b bVar = this.f15793z;
            if (bVar != null) {
                if (menuItem instanceof s3.b) {
                    ((s3.b) menuItem).u(bVar);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.A;
            boolean z11 = menuItem instanceof s3.b;
            if (z11) {
                ((s3.b) menuItem).setContentDescription(charSequence);
            } else {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.B;
            if (z11) {
                ((s3.b) menuItem).setTooltipText(charSequence2);
            } else {
                menuItem.setTooltipText(charSequence2);
            }
            char c10 = this.f15781n;
            int i12 = this.f15782o;
            if (z11) {
                ((s3.b) menuItem).setAlphabeticShortcut(c10, i12);
            } else {
                menuItem.setAlphabeticShortcut(c10, i12);
            }
            char c11 = this.f15783p;
            int i13 = this.f15784q;
            if (z11) {
                ((s3.b) menuItem).setNumericShortcut(c11, i13);
            } else {
                menuItem.setNumericShortcut(c11, i13);
            }
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                if (z11) {
                    ((s3.b) menuItem).setIconTintMode(mode);
                } else {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                if (z11) {
                    ((s3.b) menuItem).setIconTintList(colorStateList);
                } else {
                    menuItem.setIconTintList(colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f15759e = clsArr;
        f15760f = clsArr;
    }

    public a(Context context) {
        super(context);
        this.f15763c = context;
        Object[] objArr = {context};
        this.f15761a = objArr;
        this.f15762b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i10;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i10 = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            Menu menu2 = bVar.f15768a;
            if (eventType != i10) {
                if (eventType != 3) {
                    xmlPullParser2 = xmlPullParser;
                    z10 = z10;
                } else {
                    String name2 = xmlPullParser.getName();
                    if (z11 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z11 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            bVar.f15769b = 0;
                            bVar.f15770c = 0;
                            bVar.f15771d = 0;
                            bVar.f15772e = 0;
                            bVar.f15773f = true;
                            bVar.f15774g = true;
                        } else if (name2.equals("item")) {
                            if (!bVar.f15775h) {
                                y3.b bVar2 = bVar.f15793z;
                                if (bVar2 == null || !bVar2.a()) {
                                    bVar.f15775h = true;
                                    bVar.b(menu2.add(bVar.f15769b, bVar.f15776i, bVar.f15777j, bVar.f15778k));
                                } else {
                                    bVar.f15775h = true;
                                    bVar.b(menu2.addSubMenu(bVar.f15769b, bVar.f15776i, bVar.f15777j, bVar.f15778k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z10 = true;
                        }
                        xmlPullParser2 = xmlPullParser;
                        z10 = z10;
                    }
                }
                eventType = xmlPullParser2.next();
                i10 = 2;
                z10 = z10;
                z11 = z11;
            } else {
                if (!z11) {
                    String name3 = xmlPullParser.getName();
                    boolean zEquals = name3.equals("group");
                    Context context = this.f15763c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.a.f11251j);
                        bVar.f15769b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        bVar.f15770c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        bVar.f15771d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        bVar.f15772e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        bVar.f15773f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        bVar.f15774g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, g.a.f11252k);
                            bVar.f15776i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            bVar.f15777j = (typedArrayObtainStyledAttributes2.getInt(5, bVar.f15770c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, bVar.f15771d) & 65535);
                            bVar.f15778k = typedArrayObtainStyledAttributes2.getText(7);
                            bVar.f15779l = typedArrayObtainStyledAttributes2.getText(8);
                            bVar.f15780m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            bVar.f15781n = string == null ? (char) 0 : string.charAt(0);
                            bVar.f15782o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            bVar.f15783p = string2 == null ? (char) 0 : string2.charAt(0);
                            bVar.f15784q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                bVar.f15785r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                bVar.f15785r = bVar.f15772e;
                            }
                            bVar.f15786s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            bVar.f15787t = typedArrayObtainStyledAttributes2.getBoolean(4, bVar.f15773f);
                            bVar.f15788u = typedArrayObtainStyledAttributes2.getBoolean(1, bVar.f15774g);
                            bVar.f15789v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            bVar.f15792y = typedArrayObtainStyledAttributes2.getString(12);
                            bVar.f15790w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            bVar.f15791x = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            boolean z12 = string3 != null;
                            if (z12 && bVar.f15790w == 0 && bVar.f15791x == null) {
                                bVar.f15793z = (y3.b) bVar.a(string3, f15760f, this.f15762b);
                            } else {
                                if (z12) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                bVar.f15793z = null;
                            }
                            bVar.A = typedArrayObtainStyledAttributes2.getText(17);
                            bVar.B = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                bVar.D = u.b(typedArrayObtainStyledAttributes2.getInt(19, -1), bVar.D);
                            } else {
                                bVar.D = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = p3.b.getColorStateList(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                bVar.C = colorStateList;
                            } else {
                                bVar.C = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            bVar.f15775h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            bVar.f15775h = true;
                            SubMenu subMenuAddSubMenu = menu2.addSubMenu(bVar.f15769b, bVar.f15776i, bVar.f15777j, bVar.f15778k);
                            bVar.b(subMenuAddSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z11 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i10 = 2;
                        z10 = z10;
                        z11 = z11;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z10 = z10;
            }
            eventType = xmlPullParser2.next();
            i10 = 2;
            z10 = z10;
            z11 = z11;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof s3.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z10 = false;
        try {
            try {
                layout = this.f15763c.getResources().getLayout(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof androidx.appcompat.view.menu.a) {
                    androidx.appcompat.view.menu.a aVar = (androidx.appcompat.view.menu.a) menu;
                    if (!aVar.f632m) {
                        aVar.s();
                        z10 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z10) {
                    ((androidx.appcompat.view.menu.a) menu).r();
                }
                layout.close();
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th2) {
            if (z10) {
                ((androidx.appcompat.view.menu.a) menu).r();
            }
            if (layout != null) {
                layout.close();
            }
            throw th2;
        }
    }
}
