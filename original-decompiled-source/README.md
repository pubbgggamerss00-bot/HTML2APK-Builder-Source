# سورس‌کد دی‌کامپایل‌شده — HTML to APK Builder v1.32-zfix2

این بسته، سورس‌کدِ استخراج‌شده از فایل `HTML-to-APK-Builder_v1.32_zfix2.apk` با استفاده از ابزار **jadx 1.5.2** است.

## مشخصات برنامه

| مورد | مقدار |
|---|---|
| نام پکیج | `com.basitce.htmltoapk` |
| نسخه | `1.32-zfix2` (versionCode: 45) |
| زبان اصلی | Kotlin + Jetpack Compose |
| حداقل اندروید | API 28 (اندروید 9) |
| هدف | API 36 (اندروید 16) |
| محافظت | Pairip (سرویس یکپارچگی گوگل) + R8 Obfuscation |

## ساختار پوشه‌ها

```
├── README.md                            ← همین فایل
├── decompiled_project/                  ← پروژه کامل دی‌کامپایل‌شده (ساختار Gradle)
│   ├── build.gradle / settings.gradle   ← فایل‌های Gradle تولیدشده توسط jadx
│   └── app/src/main/
│       ├── AndroidManifest.xml          ← مانیفست رمزگشایی‌شده
│       ├── java/com/basitce/htmltoapk/  ← ★ کد اصلی خود برنامه (۱۱۸ فایل، ~۲۹ هزار خط)
│       ├── res/                         ← منابع رابط کاربری (لایه‌ها، تصاویر، ترجمه‌ها)
│       └── assets/                      ← ★ قالب‌های ساخت APK (مهم‌ترین بخش)
└── webview_shell_template_source/       ← سورس دی‌کامپایل‌شده‌ی shell قالبی که اپ‌های ساخته‌شده از آن ساخته می‌شوند
```

## کد اصلی برنامه (`app/src/main/java/com/basitce/htmltoapk/`)

| پوشه | توضیح |
|---|---|
| `MainActivity.java` | اکتیویتی ورودی برنامه |
| `domain/model/` | مدل‌های داده: `Project`، `ProjectFile`، `BuildConfiguration`، `BuildState`، `KeystoreInfo`، `WebViewSettings`، `ProjectLimits` |
| `data/apkgenerator/` | ★ موتور ساخت APK: `TemplateManager`، `AabGenerator`، `AabManifestEditor`، `DexRepackager`، `BuildWorkspaces`، `CacheManager`، `BuildLogger` |
| `data/apkgenerator/binaryxml/` | کدگذار/کدگشاگر XML باینری اندروید (AAPT درون‌برنامه‌ای): `BinaryXmlEncoder`، `BinaryXmlDecoder`، `ResourceTableReader` |
| `data/apkgenerator/signer/` | امضای APK با کتابخانه `apksig` گوگل |
| `data/local/` | دیتابیس Room: `AppDatabase` + جدول‌های `ProjectEntity`، `FolderEntity`، `KeystoreEntity` (ذخیره کلیدهای امضا) |
| `data/licenses/` | نمایش لایسنس‌های متن‌باز |
| `ui/screens/` | صفحات Compose شامل پیش‌نمایش و ویرایش PDF، برش تصویر (`ui/crop/CropActivity`) |
| `util/` | ابزارهای کمکی |

## قالب‌های ساخت APK (داخل `assets/`)

- **`webview_shell_template.apk` / `.aab`** — پوسته از پیش ساخته‌شده (با و بدون تبلیغات) که برنامه با تغییر مانیفست، DEX و منابع آن، خروجی کاربر را می‌سازد. کلاس اصلی آن `com.htmltoapk.template.WebViewActivity` است (سورس دی‌کامپایل‌شده‌اش در پوشه `webview_shell_template_source/` است).
- **`android_project_template/`** — یک پروژه Gradle اندروید کامل با دو flavor (نسخه عادی و نسخه تبلیغ‌دار) برای ساخت خروجی AAB.
- **`dexopt/`، `catalog_covers/`، `showcase/`** — بهینه‌سازی DEX و تصاویر کاتالوگ.

## کتابخانه‌های شناسایی‌شده

- **ساخت APK روی دستگاه:** `apksig` (امضا)، `aapt` (کامپایل منابع)، `dexlib2` (بازنویسی DEX — پروژه Smali)
- **UI:** Jetpack Compose، Coil (تصاویر)، uCrop (برش عکس)، Lottie
- **PDF:** Pdfbox-android (`com.tom_roush`)
- **گوگل:** Firebase (Auth/Analytics)، Play Billing، Play App Update، Play Review، Pairip LicenseCheck
- **شبکه:** OkHttp / Retrofit
- **زبان:** Kotlin Coroutines، Hilt (تزریق وابستگی)، Room

## نکات مهم

1. **کد Obfuscate شده است:** نسخه Release با R8/ProGuard مبهم‌سازی شده؛ به همین دلیل بسیاری از کلاس‌ها و پکیج‌ها نام‌های کوتاه مثل `a`، `b.java`، `x0.java` دارند و متغیرها/کامنت‌های اصلی از بین رفته‌اند.
2. **Pairip:** این برنامه از سرویس محافظت Pairip گوگل استفاده می‌کند (`com.pairip.licensecheck`). بخشی از منطق در ماشین مجازی Pairip اجرا می‌شود و کاملاً به جاوا قابل بازگردانی نیست.
3. **قابل کامپایل مستقیم نیست:** خروجی jadx برای *مطالعه و تحلیل* است، نه Build مجدد. برای Build کردن باید بخش‌های خراب (`/* brid */`، کدهای ناقص) دستی بازسازی شوند و منابع لازم دوباره به هم متصل شوند.
4. **۴۸ خطای دی‌کامپایل** جزئی وجود دارد (طبیعی برای APKهای obfuscate شده) — فایل‌های دارای خطا با کامنت `JADX ERROR` مشخص شده‌اند.
5. **نکته قانونی:** این سورس فقط برای بررسی، یادگیری و استفاده شخصی از اپلیکیشنی که خودتان از آن نسخه قانونی دارید ارائه شده است. بازنشر عمومی کد یا حذف سیستم لایسنس/Pairip می‌تواند نقض حقوق سازنده و شرایط گوگل‌پلی باشد.
