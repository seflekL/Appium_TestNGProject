# 📱 Appium ve JUnit ile Mobil Test Projesi

Bu proje, mobil uygulamalarınızı **Appium** ve **JUnit** kullanarak test etmek için geliştirilmiştir. Android cihazlarda kullanıcı senaryolarını simüle ederek işlevsellik, performans ve stabilite testlerini gerçekleştirmek için güçlü bir otomasyon altyapısı sağlar.

---

## 🚀 Özellikler

- **Platform Desteği**: Android uygulamalarında geniş çaplı test otomasyonu.
- **Appium Kullanımı**: Mobil cihazların özelliklerine doğrudan erişim.
- **JUnit 5 Entegrasyonu**: Test organizasyonu ve çalıştırılması için modern bir çerçeve.
- **Kolay Yapılandırma**: IntelliJ IDEA, Eclipse veya terminal üzerinden çalıştırma.
- **Appium Java Client Desteği**: Mobil cihazlar üzerinde güçlü ve esnek test senaryoları.

---

## 📋 Gereksinimler

Projeyi çalıştırmadan önce aşağıdaki araçların kurulu olduğundan emin olun:

- **Java 11** veya üstü
- **Appium Server** (Yerel makinede veya bulutta)
- **JUnit 5**
- **Appium Java Client**
- **Android SDK** (Android cihazlar veya emülatörler için)
- **Maven** veya **Gradle** (Opsiyonel)

---

## 📂 Proje Yapısı

```plaintext
Mobil_Test_Projesi/
├── src/
│   ├── main/
│   │   └── java/    → Ana uygulama dosyaları
│   ├── test/
│       └── java/    → Test sınıfları ve senaryolar
├── pom.xml           → Maven bağımlılık yönetimi
└── README.md         → Proje hakkında bilgiler
🔧 Kurulum
1. Projeyi Klonlayın
Projeyi bilgisayarınıza indirin:

bash
Copy code
git clone https://github.com/seflekL/Mobil_Test_Projesi.git
cd Mobil_Test_Projesi
2. Maven Bağımlılıklarını Yükleyin
bash
Copy code
mvn clean install
3. Appium Server'ı Başlatın
Appium Server'ı çalıştırmak için:

bash
Copy code
appium
▶️ Testlerin Çalıştırılması
IDE Üzerinden Çalıştırma
Projeyi IntelliJ IDEA veya Eclipse gibi bir IDE ile açın.
Test sınıfına veya belirli bir test metoduna sağ tıklayın.
"Run" seçeneğini seçerek testi çalıştırın.
Terminal Üzerinden Çalıştırma
Terminali açın ve proje dizinine gidin:

bash
Copy code
mvn test
📈 Test Raporları
Test sonuçları, JUnit raporları olarak otomatik oluşturulur. Raporlara target/surefire-reports dizininden erişebilirsiniz.

🤝 Katkıda Bulunun
Projeye katkıda bulunmak isterseniz:

Depoyu fork'layın.
Yeni bir dal oluşturun: git checkout -b yeni-ozellik.
Değişikliklerinizi commit edin: git commit -m "Yeni özellik eklendi".
Dalınızı push edin: git push origin yeni-ozellik.
Bir Pull Request oluşturun.
📄 Lisans
Bu proje, MIT Lisansı ile lisanslanmıştır. Daha fazla bilgi için LICENSE dosyasını inceleyin.

✍️ Yazar
Levent Seflek

Bu proje hakkında herhangi bir sorunuz varsa, lütfen Levent Seflek ile iletişime geçmekten çekinmeyin.

🌟 Teşekkürler!
Bu projeyi desteklediğiniz için teşekkür ederiz! 🎉 Herhangi bir geri bildiriminiz veya öneriniz varsa bizimle paylaşabilirsiniz. 🙌
