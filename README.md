# HTML2APK

> **HTML to APK Builder v1.32-zfix2** — سورس‌کد کامل (دی‌کامپایل‌شده) + پوستهٔ تمیز و قابل بیلد WebView + فایل APK امضاشده

این ریپو شامل سورس‌کد کاملِ دی‌کامپایل‌شدهٔ برنامهٔ **HTML to APK Builder** (سازندهٔ APK از HTML روی گوشی)، به‌همراه یک **بازسازی تمیز و قابل بیلد** از پوستهٔ WebView آن با هویت برندینگ `HTML2APK` است.

---

## ⚠️ وضعیت سورس — قبل از هر چیز بخوانید

پوشهٔ `original-decompiled-source/` خروجی ابزار **jadx 1.5.2** از فایل `HTML-to-APK-Builder_v1.32_zfix2.apk` است، **نه سورس اصلی اندروید استودیو**:

| مورد | وضعیت |
|---|---|
| Obfuscation | کل کد با **R8/ProGuard** مبهم شده (کلاس‌های `a.java`، `x0.java` و...) |
| محافظت | سرویس **Pairip** گوگل — بخشی از منطق در VM اختصاصی اجرا می‌شود |
| خطاهای دی‌کامپایل | فایل‌های دارای کامنت `JADX ERROR` (طبیعی برای APKهای obfuscate) |
| Dependencies | `build.gradle` فاقد کتابخانه‌هاست (Compose، Hilt، Firebase، Room و...) |
| نتیجه | ❌ **این سورس قابل بیلد مستقیم نیست** — فقط برای مطالعه و یادگیری |

به همین دلیل، APK قابل نصب این ریپو از روی **پوستهٔ تمیز بازسازی‌شده** (پوشهٔ `android-app/`) ساخته شده است.

---

## 📁 ساختار ریپو

```
HTML2APK/
├── README.md
├── apk/
│   ├── HTML2APK-v1.0-release.apk              ← پوستهٔ تمیز بازسازی‌شده (~۶۰۰KB)
│   └── HTML2APK_v1.32-zfix2_rebranded.apk     ← ★ APK کامل برندینگ‌شدهٔ v1.32 (~۵۱MB)
├── android-app/                        ← ★ پروژهٔ تمیز و قابل بیلد (پوستهٔ WebView)
│   ├── AndroidManifest.xml
│   ├── build.sh                        ← بیلد بدون Gradle و بدون Android Studio
│   ├── java/com/html2apk/app/
│   │   └── MainActivity.java           ← WebView کامل (JS، فایل، لینک خارجی، Back)
│   ├── res/                            ← آیکون‌های برندینگ در همهٔ دانسیتی‌ها + تم
│   └── assets/                         ← ★ محتوای HTML شما اینجاست (index.html)
├── docs/
│   ├── HTML2APK_transformation_report.md  ← ★ گزارش کامل تبدیل و QA
│   ├── patch_log.txt                      ← لاگ ماشین‌خوان همهٔ ویرایش‌ها
│   ├── checksums.txt                      ← SHA-256 همهٔ خروجی‌ها
│   └── crc_diff.txt                       ← دیف سطح Entry از اصلی تا برندینگ‌شده
├── keystore/
│   ├── html2apk-release.keystore       ← کلید امضای پوستهٔ تمیز
│   └── HTML2APK_sign.keystore          ← کلید امضای APK برندینگ‌شده
├── original-decompiled-source/         ← سورس کامل دی‌کامپایل‌شده + پچ‌های برندینگ (~۲۱۱MB)
│   ├── README.md                       ← مستندات تحلیل سورس اصلی
│   ├── HTML2APK_BRANDING_NOTES.txt     ← یادداشت‌های برندینگ
│   ├── decompiled_project/             ← پروژهٔ Gradle دی‌کامپایل‌شده
│   │   └── app/src/main/
│   │       ├── java/com/basitce/htmltoapk/   ← کد اصلی برنامه (۱۷هزار+ فایل جاوا)
│   │       ├── res/                    ← منابع UI
│   │       └── assets/                 ← ★ قالب‌های ساخت APK (shell template و...)
│   └── webview_shell_template_source/  ← سورس دی‌کامپایل‌شدهٔ پوستهٔ قالب
└── .github/workflows/build-apk.yml     ← بیلد خودکار APK با GitHub Actions
```

---

## 🎨 APK برندینگ‌شدهٔ کامل — HTML2APK v1.32-zfix2

خروجی نهایی پروژهٔ تبدیل: کل برنامهٔ اصلی v1.32-zfix2 با **حفظ ۱۰۰٪ عملکرد** (منطق، موتور ساخت، لایسنس و امنیت بایت‌به‌بایت دست‌نخورده)، فقط با تغییر هویت برند:

| مورد | مقدار |
|---|---|
| فایل | [`apk/HTML2APK_v1.32-zfix2_rebranded.apk`](apk/HTML2APK_v1.32-zfix2_rebranded.apk) |
| حجم | ~۵۱ مگابایت |
| نام نمایشی | **HTML2APK** (در هر ۴۹ زبان/لوکال) |
| Package | `com.basitce.htmltoapk` (بدون تغییر — سازگاری کامل داده‌ها) |
| versionName / Code | `1.32-zfix2` / `45` (بدون تغییر) |
| امضا | v3 — RSA 2048 · SHA-256 در [`docs/checksums.txt`](docs/checksums.txt) |
| ایمیل بازخورد | `warzonevangard@gmail.com` (در DEX بازنویسی شد) |

### ✅ چه چیزهایی تغییر کرد

- نام اپ در هر ۴۹ لوکال → **HTML2APK**، تم تیرهٔ سرمه‌ای با اکسنت نئون، آیکون لانچر جدید در همهٔ دانسیتی‌ها
- بازنویسی ۳ ثابت رشته‌ای در DEX (ازجمله ایمیل دریافت بازخورد → `warzonevangard@gmail.com`)
- ۵۲ فایل سورس‌ساید پچ‌شده در `original-decompiled-source/` هماهنگ با APK

### ⚠️ محدودیت‌ها (خلاصه — جزئیات کامل در [`docs/HTML2APK_transformation_report.md`](docs/HTML2APK_transformation_report.md))

- بازطراحی کامل Compose از این سورس ممکن نیست (UI با R8 مبهم شده) — تم سراسری تیره اعمال شد
- «Get Pro for Free» در سطح منبع/رشته حذف‌شدنی نیست؛ فقط ایمیل ارسالی‌اش تغییر کرد
- APK دوباره امضا شده؛ بررسی یکپارچگی Pairip ممکن است هنگام اجرا واکنش نشان دهد — **قبل از اتکا، روی گوشی واقعی تست نصب کنید** (APK اصلی دست‌نخورده جایگزین مطمئن است)
- کلید `HTML2APK_sign.keystore` (رمز: `html2apk_build_2026`) فقط کلید تست است — برای انتشار عمومی کلید اختصاصی بسازید

---

## 📲 نصب APK

1. فایل `apk/HTML2APK-v1.0-release.apk` را دانلود کنید.
2. روی گوشی (اندروید ۹ به بالا) باز کنید — اجازهٔ «نصب از منابع ناشناس» را تأیید کنید.
3. تمام! صفحهٔ معرفی پروژه به‌صورت آفلاین نمایش داده می‌شود.

| مشخصات | مقدار |
|---|---|
| Package | `com.html2apk.app` |
| versionName / Code | `1.0` / `1` |
| minSdk / targetSdk | ۲۸ (اندروید ۹) / ۳۴ (اندروید ۱۴) |
| امضا | v1 + v2 + v3 — RSA 2048 |
| حجم | ~۶۰۰ کیلوبایت |

---

## 🔨 بیلد از سورس (بدون Gradle)

پوستهٔ WebView هیچ وابستگی خارجی (AndroidX / Compose / Gradle) ندارد و با زنجیرهٔ مستقیم ابزارهای اندروید بیلد می‌شود:

**پیش‌نیازها:** JDK 17+ · Android build-tools 34 (`aapt2`, `d8`, `zipalign`, `apksigner`) · پلتفرم `android-34` (`android.jar`)

```bash
cd android-app
./build.sh
# → build/HTML2APK-v1.0-release.apk
```

مسیر پیش‌فرض ابزارها با متغیرهای محیطی قابل تغییر است:

```bash
SDK=/path/to/android-sdk \
BT=/path/to/build-tools-34 \
JDK=/path/to/jdk-17 \
KEYSTORE=/path/to/keystore \
./build.sh
```

### 🌐 HTML خودتان را جایگزین کنید

1. فایل‌های HTML/CSS/JS خود را داخل `android-app/assets/` بریزید.
2. صفحهٔ اصلی را `index.html` نام‌گذاری کنید (یا ثابت `START_URL` در `MainActivity.java` را عوض کنید).
3. `./build.sh` را اجرا کنید — APK شما آماده است.

### ⚙️ بیلد خودکار با GitHub Actions

پوشهٔ `.github/workflows/` شامل ورک‌فلو است که با هر push روی `main`، ابزارهای اندروید را دانلود و APK را بیلد و به‌عنوان Artifact ثبت می‌کند.

---

## 🔑 اطلاعات امضا

| مورد | مقدار |
|---|---|
| فایل کلید | `keystore/html2apk-release.keystore` |
| Alias | `html2apk` |
| رمز Store / Key | `html2apk2026` |
| الگوریتم | RSA 2048 — اعتبار ۳۰ سال |

> ⚠️ این کلید فقط برای تست ساخته شده و رمز آن عمومی است. برای انتشار عمومی یا انتشار در استور، حتماً کلید اختصاصی جدید بسازید:
> ```bash
> keytool -genkeypair -v -keystore my-release.keystore -alias myapp \
>   -keyalg RSA -keysize 2048 -validity 10950
> ```

---

## 🧩 قابلیت‌های پوستهٔ WebView

- ✅ رندر کامل HTML5 / CSS3 / JavaScript (WebView سیستم)
- ✅ کاملاً آفلاین — بارگذاری از `assets` داخلی APK
- ✅ لینک‌های http/https به‌طور خودکار در مرورگر خارجی باز می‌شوند
- ✅ پشتیبانی از ورودی‌های `<input type="file">` (انتخاب فایل از حافظه)
- ✅ دکمهٔ Back هوشمند (تاریخچهٔ WebView)
- ✅ localStorage / DOM Storage فعال
- ✅ تم تیرهٔ سرمه‌ای + آیکون تطبیقی (Adaptive Icon) در همهٔ دانسیتی‌ها
- ✅ RTL کامل

---

## 📖 دربارهٔ برنامهٔ اصلی

**HTML to APK Builder v1.32-zfix2** (`com.basitce.htmltoapk`) اپلیکیشنی است برای تبدیل پروژه‌های HTML/CSS/JS به APK/AAB امضاشده، مستقیماً روی گوشی و بدون کامپیوتر. مشخصات فنی نسخهٔ اصلی:

- **زبان:** Kotlin + Jetpack Compose · **minSdk 28 / target 36**
- **موتور ساخت روی دستگاه:** apksig (امضا) · dexlib2 (بازنویسی DEX) · AAPT باینری درون‌برنامه‌ای (کدگذار XML)
- **کتابخانه‌ها:** Hilt، Room، Retrofit/OkHttp، Firebase، Play Billing، Lottie، uCrop، Pdfbox-Android
- تحلیل کامل در [`original-decompiled-source/README.md`](original-decompiled-source/README.md)

---

## ⚖️ نکتهٔ قانونی

سورس دی‌کامپایل‌شده صرفاً برای **مطالعه، یادگیری و استفادهٔ شخصی** از اپلیکیشنی که نسخهٔ قانونی آن را دارید قرار گرفته است. بازنشر عمومی کد یا حذف سیستم لایسنس/محافظت می‌تواند نقض حقوق سازندهٔ اصلی و شرایط گوگل‌پلی باشد. پوستهٔ `android-app/` بازنویسی تمیز و مستقل است.

---

<div align="center">

**HTML2APK** · rebuilt WebView shell · 2026

`aapt2` + `javac` + `d8` + `zipalign` + `apksigner`

</div>
