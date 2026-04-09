package patterns.builder.character;

public class GameCharacter {
    private String health;
    private String damage;
    private String armor;
    private String magic;

    public GameCharacter(String health, String damage, String armor, String magic) {
        this.health = health;
        this.damage = damage;
        this.armor = armor;
        this.magic = magic;
    }

    public GameCharacter(Builder builder) {
        this.health = builder.health;
        this.damage = builder.damage;
        this.armor = builder.armor;
        this.magic = builder.magic;
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "health='" + health + '\'' +
                ", damage='" + damage + '\'' +
                ", armor='" + armor + '\'' +
                ", magic='" + magic + '\'' +
                '}';
    }

    static class Builder {
        private String health;
        private String damage;
        private String armor;
        private String magic;

        public Builder setHealth(String health) {
            this.health = health;
            return this;
        }

        public Builder setDamage(String damage) {
            this.damage = damage;
            return this;
        }

        public Builder setArmor(String armor) {
            this.armor = armor;
            return this;
        }

        public Builder setMagic(String magic) {
            this.magic = magic;
            return this;
        }

        public GameCharacter build() {
            return new GameCharacter(this);
        }
    }
}
