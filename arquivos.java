// IMusicPlayer.java
public interface IMusicPlayer {
    void playMusic(Song song);
    void pauseMusic();
    void stopMusic();
    void nextSong();
    void previousSong();
    void adjustVolume(int level);
    void displayAlbumArt(Song song);
    void browsePlaylists();
    void browseArtists();
    void browseSongs();
    void browseVideos();
    void activateCoverFlow();
}

// IPhoneDevice.java
public interface IPhoneDevice {
    void makeCall(String phoneNumber);
    void endCall();
    void answerCall();
    void declineCall();
    void sendSMS(String recipient, String message);
    void receiveSMS(String sender, String message);
    void addContact(Contact contact);
    void viewContacts();
    void viewRecents();
    void viewFavorites();
    void dialKeypad(String number);
    void checkVoicemail();
    void visualVoicemail(int messageId);
    void mergeCalls();
    void takePhoto();
    void viewPhotos();
    void setWallpaper(Photo photo);
}

// IInternetBrowser.java
public interface IInternetBrowser {
    void openURL(String url);
    void navigateBack();
    void navigateForward();
    void zoomIn();
    void zoomOut();
    void openNewTab();
    void closeTab();
    void viewBookmarks();
    void sendEmail(Email email);
    void receiveEmail(Email email);
    void viewMaps(String location);
    void getWeather(String city);
    void getStockQuotes(String symbol);
}

// Song.java
public class Song {
    private String title;
    private String artist;
    private String album;
    private String duration;
    private String albumArt;

    public Song(String title, String artist, String album, String duration, String albumArt) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
        this.albumArt = albumArt;
    }

    // Getters and Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getArtist() { return artist; }
    public void setArtist(String artist) { this.artist = artist; }
    public String getAlbum() { return album; }
    public void setAlbum(String album) { this.album = album; }
    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }
    public String getAlbumArt() { return albumArt; }
    public void setAlbumArt(String albumArt) { this.albumArt = albumArt; }
}

// Contact.java
public class Contact {
    private String name;
    private String phoneNumber;
    private String email;
    private String address;

    public Contact(String name, String phoneNumber, String email, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}

// WebPage.java
public class WebPage {
    private String url;
    private String htmlContent;

    public WebPage(String url, String htmlContent) {
        this.url = url;
        this.htmlContent = htmlContent;
    }

    // Getters and Setters
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
    public String getHtmlContent() { return htmlContent; }
    public void setHtmlContent(String htmlContent) { this.htmlContent = htmlContent; }
}

// Email.java
public class Email {
    private String from;
    private String to;
    private String subject;
    private String body;
    private boolean isRead;

    public Email(String from, String to, String subject, String body, boolean isRead) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.body = body;
        this.isRead = isRead;
    }

    // Getters and Setters
    public String getFrom() { return from; }
    public void setFrom(String from) { this.from = from; }
    public String getTo() { return to; }
    public void setTo(String to) { this.to = to; }
    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }
    public String getBody() { return body; }
    public void setBody(String body) { this.body = body; }
    public boolean isRead() { return isRead; }
    public void setRead(boolean read) { isRead = read; }
}

// Photo.java
public class Photo {
    private String filename;
    private String resolution;

    public Photo(String filename, String resolution) {
        this.filename = filename;
        this.resolution = resolution;
    }

    // Getters and Setters
    public String getFilename() { return filename; }
    public void setFilename(String filename) { this.filename = filename; }
    public String getResolution() { return resolution; }
    public void setResolution(String resolution) { this.resolution = resolution; }
}

// Voicemail.java
public class Voicemail {
    private int messageId;
    private String sender;
    private String duration;
    private String transcription;

    public Voicemail(int messageId, String sender, String duration, String transcription) {
        this.messageId = messageId;
        this.sender = sender;
        this.duration = duration;
        this.transcription = transcription;
    }

    // Getters and Setters
    public int getMessageId() { return messageId; }
    public void setMessageId(int messageId) { this.messageId = messageId; }
    public String getSender() { return sender; }
    public void setSender(String sender) { this.sender = sender; }
    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }
    public String getTranscription() { return transcription; }
    public void setTranscription(String transcription) { this.transcription = transcription; }
}


// iPhone2007.java
public class iPhone2007 implements IMusicPlayer, IPhoneDevice, IInternetBrowser {
    private String model;
    private String osVersion;
    // Assume internal storage for media, contacts, etc.
    // In a real application, these would be handled by data services or databases.

    public iPhone2007(String model, String osVersion) {
        this.model = model;
        this.osVersion = osVersion;
    }

    // General Device Methods
    public void powerOn() {
        System.out.println(model + " powering on with " + osVersion + "...");
    }

    public void powerOff() {
        System.out.println(model + " powering off.");
    }

    public void lockScreen() {
        System.out.println("Screen locked.");
    }

    public void unlockScreen() {
        System.out.println("Screen unlocked. (Slide to unlock)");
    }

    public void display(String content) {
        System.out.println("Displaying: " + content);
    }

    public void touch(int x, int y) {
        System.out.println("Touch detected at (" + x + ", " + y + ").");
    }

    public void multiTouchGesture(String gesture) {
        System.out.println("Multi-touch gesture detected: " + gesture);
    }

    // IMusicPlayer Implementations
    @Override
    public void playMusic(Song song) {
        System.out.println("Playing music: " + song.getTitle() + " by " + song.getArtist());
    }

    @Override
    public void pauseMusic() {
        System.out.println("Music paused.");
    }

    @Override
    public void stopMusic() {
        System.out.println("Music stopped.");
    }

    @Override
    public void nextSong() {
        System.out.println("Playing next song.");
    }

    @Override
    public void previousSong() {
        System.out.println("Playing previous song.");
    }

    @Override
    public void adjustVolume(int level) {
        System.out.println("Volume adjusted to: " + level);
    }

    @Override
    public void displayAlbumArt(Song song) {
        System.out.println("Displaying album art for: " + song.getAlbum());
    }

    @Override
    public void browsePlaylists() {
        System.out.println("Browse playlists...");
    }

    @Override
    public void browseArtists() {
        System.out.println("Browse artists...");
    }

    @Override
    public void browseSongs() {
        System.out.println("Browse all songs...");
    }

    @Override
    public void browseVideos() {
        System.out.println("Browse videos...");
    }

    @Override
    public void activateCoverFlow() {
        System.out.println("Activating Cover Flow...");
    }

    // IPhoneDevice Implementations
    @Override
    public void makeCall(String phoneNumber) {
        System.out.println("Calling: " + phoneNumber + "...");
    }

    @Override
    public void endCall() {
        System.out.println("Call ended.");
    }

    @Override
    public void answerCall() {
        System.out.println("Call answered.");
    }

    @Override
    public void declineCall() {
        System.out.println("Call declined.");
    }

    @Override
    public void sendSMS(String recipient, String message) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }

    @Override
    public void receiveSMS(String sender, String message) {
        System.out.println("Received SMS from " + sender + ": " + message);
    }

    @Override
    public void addContact(Contact contact) {
        System.out.println("Contact added: " + contact.getName());
    }

    @Override
    public void viewContacts() {
        System.out.println("Viewing contacts...");
    }

    @Override
    public void viewRecents() {
        System.out.println("Viewing recent calls...");
    }

    @Override
    public void viewFavorites() {
        System.out.println("Viewing favorite contacts...");
    }

    @Override
    public void dialKeypad(String number) {
        System.out.println("Dialing via keypad: " + number);
    }

    @Override
    public void checkVoicemail() {
        System.out.println("Checking voicemails...");
    }

    @Override
    public void visualVoicemail(int messageId) {
        System.out.println("Accessing visual voicemail message ID: " + messageId);
    }

    @Override
    public void mergeCalls() {
        System.out.println("Merging calls to create a conference.");
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo with 2MP camera.");
    }

    @Override
    public void viewPhotos() {
        System.out.println("Viewing photo library...");
    }

    @Override
    public void setWallpaper(Photo photo) {
        System.out.println("Setting " + photo.getFilename() + " as wallpaper.");
    }

    // IInternetBrowser Implementations
    @Override
    public void openURL(String url) {
        System.out.println("Opening URL in Safari: " + url);
    }

    @Override
    public void navigateBack() {
        System.out.println("Navigating back in browser history.");
    }

    @Override
    public void navigateForward() {
        System.out.println("Navigating forward in browser history.");
    }

    @Override
    public void zoomIn() {
        System.out.println("Zooming in on web page.");
    }

    @Override
    public void zoomOut() {
        System.out.println("Zooming out on web page.");
    }

    @Override
    public void openNewTab() {
        System.out.println("Opening a new browser tab.");
    }

    @Override
    public void closeTab() {
        System.out.println("Closing current browser tab.");
    }

    @Override
    public void viewBookmarks() {
        System.out.println("Viewing browser bookmarks.");
    }

    @Override
    public void sendEmail(Email email) {
        System.out.println("Sending email from " + email.getFrom() + " to " + email.getTo() + ": " + email.getSubject());
    }

    @Override
    public void receiveEmail(Email email) {
        System.out.println("Receiving email from " + email.getFrom() + ": " + email.getSubject());
    }

    @Override
    public void viewMaps(String location) {
        System.out.println("Opening Google Maps for: " + location);
    }

    @Override
    public void getWeather(String city) {
        System.out.println("Getting weather for: " + city);
    }

    @Override
    public void getStockQuotes(String symbol) {
        System.out.println("Getting stock quotes for: " + symbol);
    }

    public static void main(String[] args) {
        iPhone2007 myiPhone = new iPhone2007("iPhone 2G", "iPhone OS 1.0");
        myiPhone.powerOn();

        // Music Player functionality
        Song bohemianRhapsody = new Song("Bohemian Rhapsody", "Queen", "A Night at the Opera", "5:55", "Queen_ANightAtTheOpera.jpg");
        myiPhone.playMusic(bohemianRhapsody);
        myiPhone.adjustVolume(80);
        myiPhone.activateCoverFlow();
        myiPhone.browseVideos();

        System.out.println("\n--- Phone Functionality ---");
        // Phone functionality
        Contact johnnyIve = new Contact("Johnny Ive", "123-456-7890", "johnny@apple.com", "Cupertino, CA");
        myiPhone.makeCall(johnnyIve.getPhoneNumber());
        myiPhone.sendSMS("555-123-4567", "Hello from iPhone!");
        myiPhone.visualVoicemail(123);
        myiPhone.takePhoto();
        myiPhone.viewPhotos();

        System.out.println("\n--- Internet Browser Functionality ---");
        // Internet Browser functionality
        myiPhone.openURL("https://www.apple.com/iphone/");
        myiPhone.zoomIn();
        Email welcomeEmail = new Email("support@example.com", "user@example.com", "Welcome to iPhone!", "Enjoy your new device!", false);
        myiPhone.receiveEmail(welcomeEmail);
        myiPhone.viewMaps("San Francisco");
        myiPhone.getStockQuotes("AAPL");

        myiPhone.powerOff();
    }
}
